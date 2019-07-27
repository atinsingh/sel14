package co.pragra.b14.co.pragra.b14.db;

public  abstract  class DataBaseManager {



    public void insert(){
        if(getDbType().equals("MONGO")){
            System.out.println("Inserting in MonGO DB");
        }
        System.out.println("Inserting recorrd in "+ getDbType());
    }

    public void update(){
        System.out.println("Updating recorrd to "+ getDbType());
    }

    public void delete(){
        System.out.println("Delete recorrd from "+ getDbType());
    }
    public void select(){
        System.out.println("Selecting recorrd from "+ getDbType());
    }

    public abstract  String getDbType();


}
