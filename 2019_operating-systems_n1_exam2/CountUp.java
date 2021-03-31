public class CountUp extends Thread
{
    @Override public void run()
    {
        try {
            for(int i = 1; i <= 500; i++) {
                System.out.println("Programa 1 | Valor: " + i);
            }
        } catch (Exception e) { }
    }
}
