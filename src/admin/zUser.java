
package admin;

public class zUser {
    private String username;
    private String name;
    private String email;
    private int contact;
    private String address;
    private int pincode;
    
    public zUser(String Username, String Name, String Email, int Contact, String Address, int Pincode) {
        this.username=Username;
        this.name=Name;
        this.email=Email;
        this.contact=Contact;
        this.address=Address;
        this.pincode=Pincode;    
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getContact() {
        return contact;
    }
    
    public String getAddress() {
        return address;
    }
    
    public int getPincode() {
        return pincode;
    }
    
}


//To show data and set data to text fields other way with rs2xml

//  Connection Creation
//    public Connection getConnection() {
//        try {
//            con=DriverManager.getConnection("jdbc:mysql://localhost/home","root","");
//            return con;
//        } catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }
//    
//    // Get The Data from user
//    public ArrayList<User> getUsersList() {
//       
//       ArrayList<User> usersList = new ArrayList<User>();
//       Connection connection= getConnection();
//       
//       String query = "Select * from personal";
//        try {
//            sst = connection.createStatement();
//            rs=sst.executeQuery(query);
//            zUser user;
//            
//            while(rs.next()) {
//                user=new zUser(rs.getString("username"), rs.getString("name"), rs.getString("email"), rs.getInt("contact"), rs.getString("address"), rs.getInt("pincode"));
//                usersList.add(user);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return usersList;
//    }
//    
//    // Display Table
//    public void Show_Users_In_JTable() {
//        ArrayList<User> list = getUsersList();
//        DefaultTableModel model = (DefaultTableModel)jTableUpdate.getModel();
//        Object[] row= new Object[6];
//        for(int i =0; i<list.size(); i++){
//            row[0]= list.get(i).getUsername();
//            row[1]= list.get(i).getName();
//            row[2]= list.get(i).getEmail();
//            row[3]= list.get(i).getContact();
//            row[4]= list.get(i).getAddress();
//            row[5]= list.get(i).getPincode();
//            
//            model.addRow(row);
//    }
//    }    
//
//     Execute the SQL Query
//
//    public void executeSQlQuery(String query, String message){
//        Connection con = getConnection();
//        try {
//            sst=con.createStatement();
//                    if((sst.executeUpdate(query)) ==1){
//                        JOptionPane.showMessageDialog(null, "Data "+message+"Successfully" );
//                    }
//                    else{
//                        JOptionPane.showMessageDialog(null, "Data Not "+message+"");
//                    }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
    