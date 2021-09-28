package program;

public class Cart implements RecordInterface {
    private int pk;
    private String name;

    public Cart (int n, String s){
        pk = n;
        name = s;
    }

    @Override
    public int getPK()
    {
       return pk;
    }
}
