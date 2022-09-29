class TeamMate{

    private string userId;
    private string nome;
    private boolean online;

    public TeamMate(){
        this.userId = "";
        this.nome = "";
        this.online = false;
    }

    public TeamMate( string userId, string nome ){
        this.userId = userId;
        this.nome = nome;
        this.online = false;
    }
    
    public TeamMate( string userId, string nome, boolean online ){
        this.userId = userId;
        this.nome = nome;
        this.online = online;
    }

    public string getUserId(){
        return userId;
    }

    public string getNome(){
        return nome;
    }
    
    public boolean getOnline(){
        return online;
    }

    public void setUserID( string userID ){
        this.userId = userID;
    }

    public void setNome( string nome ){
        this.nome = nome;
    }
    
    public void setOnline( boolean online ){
        this.online = online;
    }

    public void printTeamMate(){
        system.out.println("\nUserID:" + userId);
        system.out.println("\nNome:" + nome);
        if( online )
            system.out.println("\nStatus: Online");
        else
            system.out.println("\nStatus: Offline");
    }

    public void printTeamMate( boolean online ){

        if( online )
            system.out.println("\nUserID:" + userId);
    }

}