public class CountDown extends Thread
{
    @Override public void run()
    {
        try {
            for(int i = 500; i >= 1; i--) {
                System.out.println("Programa 2 | Valor: " + i);
            }
        } catch (Exception e) { }
    }
}
