public class ListofTeamMates {
    public static void main(String[] args) {

        ArrayList<TeamMate> user = new ArrayList<TeamMate>();
        user.add(new TeamMate());
        user.add(new TeamMate("1","Felipe"));
        user.add(new TeamMate("2","Carlos"));
        user.add(new TeamMate("3","Julio", true));
        user.add(new TeamMate("4","Renan", true));
        user.add(new TeamMate());

        for(int i = 0; i < user.size(); i++){
            user.get(i).printTeamMate();
        }

        for(int i = 0; i < user.size(); i++){
            user.get(i).printTeamMate(user.get(i).getOnline);
        }
    }
}
