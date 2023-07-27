package persistencia;

import java.sql.*;

/*
 Paquete persistencia
En este paquete estará la clase DAO encarga de conectarse con la base de datos y de
comunicarse con la base de datos para obtener sus datos. Además, estará las clases de
EntidadDaoExt para cada entidad / tabla de nuestro proyecto.
Es importante tener la conexión creada a la base de datos, como lo explica el Instructivo en la
pestaña de Services en Netbeans.
*/
public abstract class DAO {
    // DECLARAMOS LOS COMPONENTES DE LA API JDBC
    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    
    // DECLARAMOS LOS DATOS PARA CONECTAR LA BASE DE DATOS
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    
    //private final String DRIVER = "com.mysql.jdbc.Driver"; //driver tira error de deprecated
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    // METODO PARA CONECTAR A LA DB
    protected void conectarBase() throws Exception {
        try {
            Class.forName(DRIVER);
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false"; //?useSSL=false desactiva warnings molestos.
            conexion = DriverManager.getConnection(urlBaseDeDatos, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw ex;
        }
    }

    // METODO PARA DESCONECTA LA DB.
    protected void desconectarBase() throws Exception {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (Exception ex) {
            throw ex;
        }
    }

    // METODO PARA HACER GRAN PARTE DEL CRUD.
    protected void insertarModificarEliminar(String sql) throws Exception {
        try {
            conectarBase(); // conectamos la db
            sentencia = conexion.createStatement(); // declaramos la sentencia
            sentencia.executeUpdate(sql); // ejecutamos la sentencia
        } catch (SQLException ex) {
            // conexion.rollback();
            /*  Descomentar la linea anterior si desean tener en cuenta el rollback.
                Correr el siguiente script en Workbench
            
                SET autocommit=1;
                COMMIT;
            
                **Sin rollback igual anda */
             
            throw ex;
        } finally {
            desconectarBase(); // desconectamos la db.
        }
    }

    // METODO PARA CONSULTAR LA DB.
    protected void consultarBase(String sql) throws Exception {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql); // ejecutamos la sentencia y guardamos el resultado
        } catch (Exception ex) {
            throw ex;
        }
    }
    
}
