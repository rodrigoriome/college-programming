public class SomaArray extends Thread
{
    int soma;
    int[] row;
    
    public SomaArray(int[] row)
    {
        this.row = row;
    }
    
    @Override public void run()
    {
        try {
            for (int i : this.row) {
                this.soma += i;
            }
        } catch (Exception e) {  }
        
        System.out.println(this.soma);
    }
}
