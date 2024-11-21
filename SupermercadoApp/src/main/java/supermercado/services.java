package supermercado;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class services {

    public List<models> obtenerProductos() {
        List<models> productos = new ArrayList<>();
        String query = "SELECT * FROM productos";

        try (Connection conn = utils.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                models producto = new models(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("cantidad")
                );
                productos.add(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productos;
    }
}

