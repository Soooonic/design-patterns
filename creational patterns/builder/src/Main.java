import builder.Builder;
import builder.ComputerBuilder;
import director.ComputerDirector;
import computer.Computer;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director=new ComputerDirector();
        Builder computerBuilder=new ComputerBuilder();
        director.construct(computerBuilder);
        Computer computer=computerBuilder.getResult();
        System.out.println(computer.getRAM());
    }
}
