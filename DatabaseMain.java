    package pkg603_assignment2;

    import java.sql.SQLException;

    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */

    /**
     *
     * @author Monalisa
     */
    public class DatabaseMain {

        public static void main(String[] args) throws SQLException {
        DBManager db = new DBManager();

        PersonalDetailsDB dt= new PersonalDetailsDB();
        TravelDetailsDB dt1 = new TravelDetailsDB();
        PaymentDetailsDB dt2 = new PaymentDetailsDB();
        MembershipDetailsDB dt3 = new MembershipDetailsDB();

           dt.connectTravelDB();
           dt.createPersonalDetailsTable();
           dt.queryName();
           dt.queryEmail();
           dt.queryPhoneNumber();
           dt.queryAge();
           dt.closeConnection();

           dt1.connectTravelDB();
           dt1.createTravelDetailsTable();
           dt1.queryName();
           dt1.queryTravelType();
           dt1.queryCity();
           dt1.queryPeople();
           dt1.queryDate();
           dt1.closeConnection();

           dt2.connectTravelDB();
           dt2.createPaymentDetailsTable();
           dt2.closeConnection();

           dt3.connectTravelDB();
           dt3.createMembershipTable();
           dt3.closeConnection();



           }

    }
