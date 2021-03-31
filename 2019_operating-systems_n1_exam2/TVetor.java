public class TVetor extends Thread
{
    private int[] arr;
    private int range;
    
    int[] pa = { 2, 4, 6, 8 };
    
    public TVetor(int[] arr, int range)
    {
        this.arr = arr;
        this.range = range;
    }
    
    @Override public void run()
    {
        try {
            for (int i = this.range; i < (this.range + 100); i++) {
                for (int itemPa : this.pa) {
                    System.out.println(this.arr[i] + " * " + itemPa + " = " + (this.arr[i] * itemPa));
                }
            }
        } catch (Exception e) {  }
        
    }
}
