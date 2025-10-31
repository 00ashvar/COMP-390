import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// This class handles interactions between our program and our database.
// DAOs contain all the database specific code that allows the application
// to interact with data without dealing with how it's stored or retrieved.
public class RiderDAOSQLite implements RiderDAO{
    @Override
    public int insert(Rider r) throws Exception {
        String INSERT_RIDER_SQL = "INSERT INTO rider (" +
                "first_name, last_name, email, phone_no, status)" +
                " VALUES (?, ?, ?, ?, ?)";
        try(Connection c = DatabaseManager.get();
        PreparedStatement ps = c.prepareStatement(INSERT_RIDER_SQL, Statement.RETURN_GENERATED_KEYS)) {
            ps.setString(1, r.getFirstName());
            ps.setString(2, r.getLastName());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getPhone());
            ps.setString(5, r.getStatus());
            ps.executeUpdate();
            try (ResultSet rs = ps.getGeneratedKeys()) {
                int newRiderID = rs.next() ? rs.getInt(1) : 0;
                // Is this ^ ok? I don't really know what it is doing!
                r.setId(newRiderID);
                return newRiderID;
            }
        }
    }
    @Override
    public Optional<Rider> findById(int riderId) throws Exception {
        String SELECT_RIDER_BY_ID_SQL = "SELECT * FROM rider WHERE rider_id = ?";
        try (Connection c = DatabaseManager.get();
             PreparedStatement ps = c.prepareStatement(SELECT_RIDER_BY_ID_SQL)) {
            ps.setInt(1, riderId);
            try (ResultSet rs = ps.executeQuery()){
                Rider r = new Rider(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone_no"),
                        rs.getString("status")
                );
                r.setId(rs.getInt("rider_id"));
                return Optional.of(r);
            }
        }
    }
    @Override
    public List<Rider> findAll() throws Exception{
        String SELECT_ALL_RIDER_SQL = "SELECT * FROM rider ORDER BY rider_id";
        try (Connection c = DatabaseManager.get();
        PreparedStatement ps = c.prepareStatement(SELECT_ALL_RIDER_SQL);
        ResultSet rs = ps.executeQuery()){
            List<Rider> out = new ArrayList<>();
            while(rs.next()){
                Rider r = new Rider(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("email"),
                        rs.getString("phone_no"),
                        rs.getString("status")
                );
                r.setId(rs.getInt("driver_id"));
                out.add(r);
            }
            return out;
        }
    }
    @Override
    public int update(Rider r) throws Exception {
        String UPDATE_RIDER_SQL =
                "UPDATE rider SET first_name = ?, " +
                "last_name = ?, " +
                "email = ?, " +
                "phone_no = ?, " +
                "status = ? " +
                "WHERE rider_id = ?";
        try (Connection c = DatabaseManager.get();
            PreparedStatement ps = c.prepareStatement(UPDATE_RIDER_SQL)){
            ps.setString(1, r.getFirstName());
            ps.setString(2, r.getLastName());
            ps.setString(3, r.getEmail());
            ps.setString(4, r.getPhone());
            ps.setString(5, r.getStatus());
            ps.setInt(6, r.getId());
            return ps.executeUpdate();
        }
    }
    @Override
    public int delete(int riderID) throws Exception{
        String DELETE_RIDER_SQL = "DELETE FROM rider WHERE rider_id = ?";
        try (Connection c = DatabaseManager.get();
            PreparedStatement ps = c.prepareStatement(DELETE_RIDER_SQL)){
            ps.setInt(1, riderID);
            return ps.executeUpdate();
        }
    }
}
