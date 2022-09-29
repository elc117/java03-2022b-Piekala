public class ListofTeamMates {
    public static void main(String[] args) {
        ArrayList<TeamMate> list = new ArrayList<TeamMate>();
        list.add(new TeamMate());
        list.add(new TeamMate("1","Julio", true));
        list.add(new TeamMate("2","Renan", true));
        list.add(new TeamMate("3","Felipe"));
        list.add(new TeamMate("4","Carlos"));
        list.add(new TeamMate());

        for(int i = 0; i < 6; i++){
            list[i].printTeamMate();
        }
        
        for(int i = 0; i < 6; i++){
            list[i].printTeamMate(list[i].getOnline);
        }
    }
}