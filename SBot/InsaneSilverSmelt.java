//Start in west fally bank
//Made by Insane
//Props to RichyT <3
//Edited by CanadianBacon for silver.
public class InsaneSilverSmelt extends Script
      {
  public InsaneSilverSmelt(mudclient rs)
      {
     super(rs);
      }
  public String[] getCommands()
      {
     return new String[]{"ismeltsilver"};
      }
  public void start(String command, String parameter[])
      {
     DisplayMessage("@cya@Andrew says: You have now activated the Insane Silver Smelter",3);
     DisplayMessage("@cya@Andrew Says: Have a good time autoing, and dont get caught :o)",3);   
     while (Running())
      {
       while (QuestMenu() == false && Running() == true)
      {
           int BankerID = GetNearestNPC(95);
           TalkToNPC(BankerID);
           Wait(2000);
      }
       Answer(0);

           while (Bank() == false && Running() == true)
      {
               Wait(100);
      }


           while (Bank() == true && Running() == true)
      {
           while(InvCount(384) > 0)
      {
               Deposit(384,1);
               Wait(100);
      }

           while(InvCount(383) < 29)
      {
               Withdraw(383,1);
               Wait(100);
      }
               CloseBank();
      }
            AtObject(327,552);
            Wait(2000);
            Walk(321,552);
            Wait(50);
            Walk(315,550);
            Wait(50);
            Walk(312,544);
            Wait(50);
            OpenDoor(312, 544, 1); 
            Walk(311,544);
          
       DisplayMessage("@cya@Andrew Says: Smelting Time",3);   
           while (InvCount(383) > 0)
      {
        UseOnObject(306,546,FindInv(383));
        Wait(3000);
        
        if(Fatigue() > 99 && Running() == true)
      {
        while (Sleeping() == false)
      {
           Use(FindInv(1263));
           Wait(2800);
      }
        while (Sleeping() == true)
      {
           Wait(200);
      }
      }
      }
            OpenDoor(312, 544, 1);
            Walk(314,548);
           Wait(50);
           Walk(317,551);
           Wait(50);
           Walk(322,553);
           Wait(50);
           AtObject(327,552);
           Wait(2000);
           Walk(328,551);
           Wait(200);         
     }
     DisplayMessage("@whi@.:::::Thank:::::.", 3);
     Wait(200);
     DisplayMessage("@gre@.:::::You For:::::.", 3);
     Wait(200);
     DisplayMessage("@mag@.:::::Testing:::::.", 3);
     Wait(200);
     DisplayMessage("@bla@.:::::The Insane:::::.", 3);
     Wait(200);
     DisplayMessage("@ran@.:::::Silver Smelter:::::.", 3);
     Wait(200);
     DisplayMessage("@red@.:::::By Insane:::::.", 3);
     Wait(200);
     DisplayMessage("@whi@.:::::Edited By Jibz:::::.", 3);
     Wait(200);
     DisplayMessage("@gre@.:::::So now:::::.", 3);
     Wait(200);
     DisplayMessage("@mag@.:::::It Opens Doors:::::.", 3);
     Wait(200);
     DisplayMessage("@bla@.:::::And Wait Time Reduced:::::.", 3);
     Wait(200);
     DisplayMessage("@ran@.:::::For People Who Lag:::::.", 3);
     Wait(200);
     DisplayMessage("@cya@.:::::Edited By CanadianBacon:::::.", 3); 
     Wait(200);
     DisplayMessage("@red@.:::::For Silver:::::.", 3);   
     }
}