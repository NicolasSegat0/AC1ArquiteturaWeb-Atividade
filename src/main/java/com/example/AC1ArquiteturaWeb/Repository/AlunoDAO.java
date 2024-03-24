public class AlunoDAO {

    private Conection conection; 

    public AlunoDAO() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula05", "root", "Batata#2023");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
 
    }

    public void deleteById(Long id) {
        try {
            String sql = "DELETE FROM aluno WHERE id = ?"; 
            PreparedStatment statment = conection.PreparedStatment(sql); 
            statment.setLong(1, id); 
            statment.executeUpdate(); 

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            if (conection != null) {
                conection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
