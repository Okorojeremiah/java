package com.dietelProject.chapterFive;

import java.util.Scanner;

public class Nokia3310 {

    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);

        System.out.printf("Select from the list of menu functions%n%n1. Phone book %n2. Messages %n3. Chat %n4. Call register %n5. Tones %n6. Settings %n7. Call divert %n8. Games %n9. Calculator %n10. Reminders %n11. Clock %n12. Profiles %n13. SIM services%n%n");
        System.out.print("Enter a number: ");
        int phone = menu.nextInt();


        switch(phone) {
            case 1:
                System.out.printf("Phonebook%n%n1. Search %n2. Service Nos. %n3. Add name %n4. Erase %n5. Edit %n6. Assign tone %n7. Send b'card %n8. Options %n9 Speed dials %n10 Voice tags%n%n");
                System.out.print("Enter a number: ");
                int number = menu.nextInt();

                switch (number) {
                    case 1:
                        System.out.printf("Search_____________%n");
                        break;

                    case 2:
                        System.out.printf("Service Nos:_________%n");
                        break;

                    case 3:
                        System.out.printf("Add name:_________");
                        break;

                    case 4:
                        System.out.printf("Erase");
                        break;

                    case 5:
                        System.out.printf("Edit");
                        break;

                    case 6:
                        System.out.printf("Assign tone");
                        break;

                    case 7:
                        System.out.printf("Send b'card");
                        break;

                    case 8:
                        System.out.printf("Options%%n1. Type of view %n2. Memory%n%n");
                        System.out.print("Enter a number: ");
                        int number2 = menu.nextInt();
                        switch (number2) {
                            case 1:
                                System.out.print("Type of view");
                                break;
                            case 2:
                                System.out.print("Memory status");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;

                    case 9:
                        System.out.printf("Speed dials");
                        break;

                    case 10:
                        System.out.printf("Voice tags");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }
                break;
            case 2:
                System.out.printf("Messages%n%n1. Write Messages %n2. Inbox %n3. Outbox %n4. Picture Messages %n5. Template %n6. Smileys %n7. Message Setting%n8. info service %n9. voice mailbox number %n10. Service command editor%n%n");
                System.out.print("Enter a number: ");
                int number3 = menu.nextInt();

                switch (number3) {
                    case 1:
                        System.out.printf("Write Messages%n");
                        break;

                    case 2:
                        System.out.printf("Inbox%n");
                        break;

                    case 3:
                        System.out.printf("Outbox");
                        break;

                    case 4:
                        System.out.printf("Picture Messages");
                        break;

                    case 5:
                        System.out.printf("Template");
                        break;

                    case 6:
                        System.out.printf("Smileys");
                        break;

                    case 7:
                        System.out.printf("Message settings%n%n1. Set %n2. Common%n%n");
                        System.out.print("Enter a number: ");
                        int number4 = menu.nextInt();
                        switch(number4) {
                            case 1:
                                System.out.printf("1. Message center number%n2. Message sent as%n3. Message Valid1ty%n%n");
                                System.out.print("Enter a number: ");
                                int number5 = menu.nextInt();
                                switch(number5) {
                                    case 1:
                                        System.out.printf("Message center number%n");
                                        break;
                                    case 2:
                                        System.out.printf("Message sent as%n");
                                        break;
                                    case 3:
                                        System.out.printf("Message Validity");
                                        break;
                                    default :
                                        System.out.printf("Wrong input");
                                }
                            case 2:
                                System.out.printf("1. Delivery reports %n2. Reply via same center %n3. Character support%n");
                                System.out.print("Enter a number: ");
                                int number6 = menu.nextInt();
                                switch(number6) {
                                    case 1:
                                        System.out.print("Delivery reports");
                                        break;
                                    case 2:
                                        System.out.print("Reply via same center");
                                        break;
                                    case 3:
                                        System.out.print("Character support");
                                        break;
                                    default :
                                        System.out.print("Wrong input");

                                }

                        }
                        break;
                    case 8:
                        System.out.print("Info services");
                        break;

                    case 9:
                        System.out.print("Voice mailbox number");
                        break;

                    case 10:
                        System.out.print("Service command editor");
                        break;

                    default :
                        System.out.print("Wrong input");
                        break;

                }
                break;
            case 3 :
                System.out.print("Chat");
                break;
            case 4 :
                System.out.printf("Call register%n%n1. Missed call %n2. Received call %n3. Dialed call %n4. Erase recent call list %n5. Show call duration %n6. Show call cost %n7. Call cost settings %n8. Prepaid credit%n%n");
                System.out.print("Enter a number");
                int number7 = menu.nextInt();
                switch(number7) {
                    case 1:
                        System.out.print("Missed call");
                        break;
                    case 2:
                        System.out.print("Received call");
                        break;
                    case 3:
                        System.out.print("Dialed call");
                        break;
                    case 4:
                        System.out.print("Erase recent call list");
                        break;
                    case 5:
                        System.out.printf("Show call duration%n%n1. Last call duration %n2. All calls duration %n3. Received calls duration %n4. Dialed calls duration %n5. Clear timers%n%n");
                        System.out.print("Enter a number: ");
                        int number8 = menu.nextInt();
                        switch(number8) {
                            case 1:
                                System.out.print("Last call duration");
                                break;
                            case 2:
                                System.out.print("All calls duration");
                                break;
                            case 3:
                                System.out.print("Received calls duration");
                                break;
                            case 4:
                                System.out.print("Dialed calls duration");
                                break;
                            case 5:
                                System.out.print("Clear timers");
                                break;
                            default :
                                System.out.print("Wrong input");
                        }
                        break;
                    case 6:
                        System.out.printf("Show call cost%n%n1. Last call cost %n2. All calls cost %n3. Clear counters%n%n");
                        System.out.print("Enter a number");
                        int number9 = menu.nextInt();
                        switch(number9) {
                            case 1:
                                System.out.print("Last call cost");
                                break;
                            case 2:
                                System.out.print("All calls cost");
                                break;
                            case 3:
                                System.out.print("Clear counters");
                            default :
                                System.out.print("Wrong input");
                        }
                        break;
                    case 7:
                        System.out.printf("Call cost settings%n%n1. Call cost limit %n2. Show costs in%n%n");
                        System.out.print("Enter a number: ");
                        int number10 = menu.nextInt();
                        switch(number10) {
                            case 1:
                                System.out.print("Call cost limit");
                                break;
                            case 2:
                                System.out.print("Show costs in%n%n");
                                break;
                            default :
                                System.out.print("Wrong input");
                        }
                        break;

                    case 8:
                        System.out.print("Prepaid credit");
                        break;
                    default :
                        System.out.print("Wrong input");
                        break;

                }
                break;
            case 5:
                System.out.printf("Tones%n%n1. Ringing tones %n2. Ringing volume %n3. Incoming call alert %n4. Composer %n5. Message alert tone %n6 Warning and game tones %n7. Vibrating alert %n8. Screen saver%n%n");
                System.out.print("Enter a number: ");
                int number11 = menu.nextInt();
                switch (number11){
                    case 1:
                        System.out.print("Ringing tones");
                        break;
                    case 2:
                        System.out.print("Ringing volume");
                        break;
                    case 3:
                        System.out.print("Incoming call alert");
                        break;
                    case 4:
                        System.out.print("Composer");
                    case 5:
                        System.out.print("Message alert tones");
                        break;
                    case 6:
                        System.out.print("Keypad tones");
                        break;
                    case 7:
                        System.out.print("Warning and game tones");
                    case 8:
                        System.out.print("Vibrating alert");
                    case 9:
                        System.out.print("Screen saver");
                        break;
                    default :
                        System.out.print("Wrong input");
                        break;
                }
                break;
            case 6:
                System.out.printf("Settings%n%n1. Call settings %n2. Phone settings %n3. Security settings %n4. Restore factory settings%n%n");
                System.out.print("Enter a number: ");
                int number12 = menu.nextInt();
                switch(number12) {
                    case 1:
                        System.out.printf("Call settings%n%n1. Automatic redial %n2. Speed dialing %n3. Call waiting option %n4. Own number sending %n5. Phone line in use %n6. Automatic answer%n%n");
                        System.out.print("Enter a number: ");
                        int number13 = menu.nextInt();
                        switch(number13){
                            case 1:
                                System.out.print("Automatic redial");
                                break;
                            case 2:
                                System.out.print("Speed dialing");
                                break;
                            case 3:
                                System.out.print("Call waiting option");
                                break;
                            case 4:
                                System.out.print("Own number sending");
                                break;
                            case 5:
                                System.out.print("Phone line in use");
                            case 6:
                                System.out.print("Automatic answer");
                                break;
                            default:
                                System.out.print("Wrong input");
                        }
                        break;
                    case 2:
                        System.out.printf("Phone settings%n%n1. Language %n2. Cell info display %n3. Welcome note %n4. Network selection %n5. Lights %n6. Confirm SIM service options%n%n");
                        System.out.print("Enter a number: ");
                        int number14 = menu.nextInt();
                        switch (number14){
                            case 1:
                                System.out.print("Language");
                                break;
                            case 2:
                                System.out.print("Cell info display");
                                break;
                            case 3:
                                System.out.print("welcome");
                                break;
                            case 4:
                                System.out.print("Network selection");
                                break;
                            case 5:
                                System.out.print("Lights");
                                break;
                            case 6:
                                System.out.print("Confirm SIM service option");
                                break;
                            default :
                                System.out.print("Wrong input");
                        }
                        break;
                    case 3:
                        System.out.printf("Security settings%n%n1. Pin code request %n2. Call barring service %n3. Fixed dialing %n4. Closed user group %n5. Phone security %n6. Change access code%n%n");
                        System.out.print("Enter a number");
                        int number15 = menu.nextInt();
                        switch(number15) {
                            case 1:
                                System.out.print("Pin code request");
                                break;
                            case 2:
                                System.out.print("Call barring service");
                                break;
                            case 3:
                                System.out.print("Fixed dialing");
                                break;
                            case 4:
                                System.out.print("Closed user group");
                                break;
                            case 5:
                                System.out.print("Phone security");
                                break;
                            case 6:
                                System.out.print("Change access code");
                                break;
                            default:
                                System.out.print("Wrong input");
                                break;
                        }
                        break;
                    case 4:
                        System.out.print("Restore factory settings");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }
                break;
            case 7:
                System.out.print("Call divert");
                break;
            case 8:
                System.out.print("Games");
                break;
            case 9:
                System.out.print("Calculator");
                break;
            case 10:
                System.out.print("Reminder");
                break;
            case 11:
                System.out.printf("Clock%n%n1. Alarm clock %n2. Clock settings %n3. Date setting %n4. Stopwatch %n5. countdown timer %n6. Auto update of date and time%n%n");
                System.out.print("Enter a number: ");
                int number16 = menu.nextInt();
                switch (number16) {
                    case 1:
                        System.out.print("Alarm clock");
                        break;
                    case 2:
                        System.out.print("Clock settings");
                        break;
                    case 3:
                        System.out.print("Date setting");
                        break;
                    case 4:
                        System.out.print("Stopwatch");
                        break;
                    case 5:
                        System.out.print("Countdown timer");
                        break;
                    case 6:
                        System.out.print("Auto update of time and date");
                        break;
                    default:
                        System.out.print("Wrong input");
                        break;
                }
                break;
            case 12:
                System.out.print("Profiles");
                break;
            case 13:
                System.out.print("SIM services");
                break;
            default:
                System.out.print("Wrong input");
                break;
        }

    }
}