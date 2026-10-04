public class PlacementReadiness {
    public static void main(String[] args) {
        int marks =80;
        int attendance =78;
        int practiceDays =3;
        String status = (marks>=60 && attendance>=75) ? "Placement Ready" : "Practice";
        System.out.println("Status: "+status);
        for(int i=1;i<=practiceDays;i++){
            System.out.println("Practice Days: "+i);
        }
    }
}

