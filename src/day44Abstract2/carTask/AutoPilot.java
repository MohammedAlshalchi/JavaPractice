package day44Abstract2.carTask;

public interface AutoPilot extends AutoPark{
    /*
    3. Create a child interface of AutoPark named AutoPilot
				Variables:
					hasAutoPilot

				Abstract method:
					selfDrive();

     */

   public boolean hasAutoPilot = false;

   public abstract void selfDrive();

    @Override
    void autoPark();
}
