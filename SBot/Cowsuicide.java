public class Cowsuicide extends Script
{
   public Cowsuicide(mudclient rs)
   {
       super(rs);
       
   }
   public String[] getCommands()
   {
       return new String[]{"cowsuicide"};
       
   }
   public void start(String command, String parameter[])
   {
     DisplayMessage("@dre@=@whi@=@dre@= @whi@Cow Suicide Script - By @red@Fert @whi@ @dre@=@whi@=@dre@=", 3);
     
     int DesiredLevel = Integer.parseInt(parameter[1]);
     int FightMode = Integer.parseInt(parameter[0]);
     while (Running())
    {
      if (GetStat(0) == DesiredLevel)
   {
    System.out.println();
               System.out.println("You Have Reached Your Desired Attack Level, Closing SBoT...");
               System.out.println("<3 FeRtY");
    System.out.println();
        Quit();
   }
      if (GetStat(1) == DesiredLevel)
   {
    System.out.println();
               System.out.println("You Have Reached Your Desired Defense Level, Closing SBoT...");
               System.out.println("<3 FeRtY");
    System.out.println();
        Quit();
   }
      if (GetStat(2) == DesiredLevel)
   {
    System.out.println();
               System.out.println("You Have Reached Your Desired Strength Level, Closing SBoT...");
               System.out.println("<3 FeRtY");
    System.out.println();
        Quit();
   }   
     
       
        if (GetX() == 120 && GetY() == 648)
     {
     System.out.println();
               System.out.println("Weilding Weapons and Walking Back to Cows...");
     System.out.println();
     Wield(1);
     Wait(100);
     Wield(2);
     Wait(100);
     Walk(127,644);
     Wait(100);
     Walk(134,638);
     Wait(100);
     Walk(135,628);
     Wait(100);
     Walk(134,625);
     Wait(100);
     Walk(128,625);
     Wait(100);
     Walk(119,625);
     Wait(100);
     Walk(110,626);
     Wait(100);
     Walk(106,620);
     Wait(100);
     Walk(98,620);
     }
     if (Fatigue() > 95 && Sleeping() == false)
               {
            System.out.println();
                                      System.out.println("To Tired Sleeping...");
                                System.out.println();
            DisplayMessage("@Dre@SBoT: @whi@Sleeping", 3);
                  Use(FindInv(1263));
                  Wait(5000);
               }
     
       
      int Cow = GetNearestNPC(6);
          if (Cow != -1)
          { 
           AttackNPC(Cow);
           }
       Wait(100);
       
       if (InCombat() == true)
       {
       SetFightMode(FightMode);
       }
     
     
       
     
  }
 DisplayMessage("@dre@=@whi@=@dre@= @red@STOPPED @dre@=@whi@=@dre@=", 3);
 }
}