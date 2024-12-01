interface Cycle{
    public void applyBreake(int decrement);
    public void applySpeed(int increament);
}
interface Bycycle{
    public void blowHorn();
    public void blowTik();
}
class CombinedCycle implements Cycle, Bycycle{
    int n = 23;
    public void applySpeed(int increament){
        System.out.println("Incresing speed of Bycycle...........!");
    }
    public void applyBreake(int decrement){
        System.out.println("cycle coming slow....!");
    }
    public void blowTik(){
        System.out.println("tik tik tik tik ......!");
    }
    public void blowHorn(){
        System.out.println("pee pee peee peee......!");
    }
}
public class Main
{
	public static void main(String[] args) {
		System.out.println("Interface in java");
		CombinedCycle n = new CombinedCycle();
		n.blowHorn();
		}
}
