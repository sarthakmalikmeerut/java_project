import java.io.IOException;
import java.util.Scanner;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
public class project {
    public static void main(String[] st)  {
        Configuration config = new Configuration();
        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("9920.dic");
        config.setLanguageModelPath("9920.lm");

        try {

            LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
            speech.startRecognition(true);
            SpeechResult speechResult = null;
//capturing voice
            while ((speechResult = speech.getResult()) != null) {
                String voiceCommand = speechResult.getHypothesis();
                System.out.println("Voice Command is " + voiceCommand);
//speech recognition





//end speech recognition

//string matching

                String show_email= " SHOW MY EMAILS";
                String java_teacher = " JAVA TEACHER";
                String close_chrome = "CLOSE CHROME";
                String compose_email = "COMPOSE EMAIL";
                String find = "OPEN CHROME";
                catch_string(voiceCommand,find);
                catch_string(voiceCommand,compose_email);
                String how = " HOW ARE ";
                catch_string(voiceCommand,how);
                String tea = " TEA ";
                catch_string(voiceCommand,tea);
                String tts = " TEXT TO SPEECH ";
                catch_string(voiceCommand,tts);
                String date_pass = " DATE ";
                catch_string(voiceCommand,date_pass);

                String music = "PLAY MUSIC";
                String close_music = "CLOSE MUSIC";
                catch_string(voiceCommand,music);
                String location = " LOCATION ";
                catch_string(voiceCommand,location);
                catch_string(voiceCommand,close_music);
                catch_string(voiceCommand,close_chrome);
                catch_string(voiceCommand,show_email);
                catch_string(voiceCommand,java_teacher);
                catch_string(voiceCommand," SHOW MY WHATSAPP ");
                catch_string(voiceCommand," OPEN MY WHATSAPP ");
                catch_string(voiceCommand, " OPEN WHATSAPP ");


//commands to execute

                if (voiceCommand.equalsIgnoreCase("can you show my emails")) {
                    Runtime.getRuntime().exec("cmd.exe /c start msedge https://mail.google.com/mail/u/0/#inbox");
                }
                else if (voiceCommand.equalsIgnoreCase("open 5")) {
                    Runtime.getRuntime().exec("cmd.exe /c  \"C:\\Grand Theft Auto V\\GTA5.exe\"");
                }
                else if (voiceCommand.equalsIgnoreCase("close my emails")) {
                    Runtime.getRuntime().exec("cmd /c TASKKILL /F /IM msedge.exe");
                }
                else if (voiceCommand.equalsIgnoreCase("close it")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /F /IM WhatsApp.exe");
                }
                else if (voiceCommand.equalsIgnoreCase("can you compose one email for me")) {
                    Runtime.getRuntime().exec("cmd.exe /c start msedge https://mail.google.com/mail/u/0/#inbox?compose=new");
                }
                else if (voiceCommand.equalsIgnoreCase("shut down")) {
                    Runtime.getRuntime().exec("cmd.exe /c shutdown /s /f");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void catch_string(String text,String pattern) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        Voice voice = VoiceManager.getInstance().getVoice("kevin16");



        int text_len= text.length();
        int pattern_len = pattern.length();
        for (int i = 0 , j=pattern_len-1; j<text_len ;)
        {
            if(pattern.equals(text.substring(i,j+1)))
            {

                switch (pattern)
                {
                    case "OPEN CHROME":
                        Runtime.getRuntime().exec("cmd.exe /c start chrome.exe");
                        break;
                    case " HOW ARE ":
                        voice.allocate();
//                        System.out.println("voice rate: "+voice.getRate());
//                        System.out.println("voice pitch: "+voice.getPitch());
//                        System.out.println("Voice volume: "+voice.getVolume());
                        boolean status = voice.speak("i am good, what about you");
                        System.out.println("Status: "+status);
                        voice.deallocate();
                        break;
                    case " TEA ":
                        int max = 5;
                        int min = 1;
                        double v = (Math.random()*(max-min))+min;
                        switch ((int) v) {
                            case 1 -> {
                                voice.allocate();
//                                System.out.println("voice rate: " + voice.getRate());
//                                System.out.println("voice pitch: " + voice.getPitch());
//                                System.out.println("Voice volume: " + voice.getVolume());
                                status = voice.speak("i  dont like either of them. thank you !");
                                System.out.println("Status: " + status);
                                voice.deallocate();
                                break;
                            }
                            case 2 -> {
                                voice.allocate();
                                System.out.println("voice rate: " + voice.getRate());
                                System.out.println("voice pitch: " + voice.getPitch());
                                System.out.println("Voice volume: " + voice.getVolume());
                                boolean statu = voice.speak("i  dont like either ");
                                System.out.println("Status: " + statu);
                                voice.deallocate();
                                break;
                            }
                            case 3 -> {
                                voice.allocate();
                                System.out.println("voice rate: " + voice.getRate());
                                System.out.println("voice pitch: " + voice.getPitch());
                                System.out.println("Voice volume: " + voice.getVolume());
                                boolean stat = voice.speak("thank you !");
                                System.out.println("Status: " + stat);
                                voice.deallocate();
                                break;
                            }
                            case 4 -> {
                                voice.allocate();
                                System.out.println("voice rate: " + voice.getRate());
                                System.out.println("voice pitch: " + voice.getPitch());
                                System.out.println("Voice volume: " + voice.getVolume());
                                boolean sta = voice.speak("i  like batteries");
                                System.out.println("Status: " + sta);
                                voice.deallocate();
                                break;
                            }
                            case 5 -> {
                                voice.allocate();
                                System.out.println("voice rate: " + voice.getRate());
                                System.out.println("voice pitch: " + voice.getPitch());
                                System.out.println("Voice volume: " + voice.getVolume());
                                boolean sti = voice.speak("shut up.");
                                System.out.println("Status: " + sti);
                                voice.deallocate();
                                break;
                            }

                        }
                        break;
                    case " TEXT TO SPEECH ":
                        String s = sc.nextLine();
                        voice.allocate();
                        System.out.println("voice rate: " + voice.getRate());
                        System.out.println("voice pitch: " + voice.getPitch());
                        System.out.println("Voice volume: " + voice.getVolume());
                        boolean ttsc = voice.speak(s);
                        System.out.println("Status: " + ttsc);
                        voice.deallocate();
                        break;
                    case " DATE ":
                        long millis = System.currentTimeMillis();
                        java.util.Date date = new java.util.Date(millis);
                        s = String.valueOf(date);
                        String a = s.substring(0,11);
                        System.out.println(a);
                        voice.allocate();
                        System.out.println("voice rate: "+voice.getRate());
                        System.out.println("voice pitch: "+voice.getPitch());
                        System.out.println("Voice volume: "+voice.getVolume());
                        boolean date_speak = voice.speak(a);
                        System.out.println("Status: "+date_speak);
                        voice.deallocate();
                        break;
                    case "PLAY MUSIC":
                        Runtime.getRuntime().exec("cmd.exe /c start msedge.exe https://www.spotify.com");
                        break;
                    case "CLOSE CHROME":
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                        break;
                    case " SHOW MY WHATSAPP ":
                        Runtime.getRuntime().exec("cmd.exe /c \"C:\\Users\\sarth\\Desktop\\WhatsApp.lnk\"");
                        break;
                    case " OPEN MY WHATSAPP ":
                        Runtime.getRuntime().exec("cmd.exe /c \"C:\\Users\\sarth\\Desktop\\WhatsApp.lnk\"");
                        break;
                    case " OPEN WHATSAPP ":
                        Runtime.getRuntime().exec("cmd.exe /c \"C:\\Users\\sarth\\Desktop\\WhatsApp.lnk\"");
                        break;
                    case "COMPOSE EMAIL":
                        Runtime.getRuntime().exec("cmd.exe /c start msedge https://mail.google.com/mail/u/0/#inbox?compose=new");
                        break;

                    case "CLOSE MUSIC":
                        Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM msedge.exe");
                        break;
                    case " SHOW MY EMAILS":
                        Runtime.getRuntime().exec("cmd.exe /c start msedge https://mail.google.com/mail/u/0/#inbox");
                        break;
                    case " JAVA TEACHER":
                        voice.allocate();
//                        System.out.println("voice rate: " + voice.getRate());
//                        System.out.println("voice pitch: " + voice.getPitch());
//                        System.out.println("Voice volume: " + voice.getVolume());
                        boolean jt = voice.speak("your java teacher is madam chaand ani bhasin");
                        System.out.println("Status: " + jt);
                        voice.deallocate();
                    case "BEHEN":
                        voice.allocate();
//                        System.out.println("voice rate: " + voice.getRate());
//                        System.out.println("voice pitch: " + voice.getPitch());
//                        System.out.println("Voice volume: " + voice.getVolume());
                        boolean bl = voice.speak("main behen ka lodda hoon sabse baraaaaaaaaaa vala");
                        System.out.println("Status: " + bl);
                        voice.deallocate();

                }
                System.out.println("pattern found... "+ i);
            }
            i++;
            j++;
        }
    }
}