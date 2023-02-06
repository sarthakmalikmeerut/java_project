import java.io.IOException;



import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;


public class project {


    public static void main(String[] st)  {




//date and time
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();


        Configuration config = new Configuration();

        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("9920.dic");
        config.setLanguageModelPath("9920.lm");




        long millis = System.currentTimeMillis();


        try {

            LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
            speech.startRecognition(true);

            SpeechResult speechResult = null;
//capturing voice
            while ((speechResult = speech.getResult()) != null) {
                String voiceCommand = speechResult.getHypothesis();
                System.out.println("Voice Command is " + voiceCommand);

//speech recognition
                System.setProperty("freetts.voices","com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
                Voice voice = VoiceManager.getInstance().getVoice("kevin16");
                Voice[] voicelist = VoiceManager.getInstance().getVoices();

                for(int i = 0 ; i<voicelist.length;i++)
                {
                    System.out.println("# Voice: "+voicelist[i].getName());
                }






//end speech recognition


//commands to execute

                if (voiceCommand.equalsIgnoreCase("Open Chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome");
                }


                else if (voiceCommand.equalsIgnoreCase("play music")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome https://open.spotify.com/");
                }


                else if (voiceCommand.equalsIgnoreCase("Close Chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                }


                else if (voiceCommand.equalsIgnoreCase("can you show my emails")) {
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



                else if (voiceCommand.equalsIgnoreCase("can you show my whatsapp")) {
                    Runtime.getRuntime().exec("cmd.exe /c  \"C:\\Users\\sarth\\Desktop\\WhatsApp.lnk\"");



//conversation



//today date
                } else if (voiceCommand.equalsIgnoreCase("what is today date")) {
                    if(voice != null)
                    {
                        java.util.Date date = new java.util.Date(millis);
                        String s = String.valueOf(date);
                        String a = s.substring(0,11);
                        System.out.println(a);
                        voice.allocate();
                        System.out.println("voice rate: "+voice.getRate());
                        System.out.println("voice pitch: "+voice.getPitch());
                        System.out.println("Voice volume: "+voice.getVolume());
                        boolean status = voice.speak(a);
                        System.out.println("Status: "+status);
                        voice.deallocate();
                    }
                    System.out.println(dtf.format(now));

//how are you
                } else if (voiceCommand.equalsIgnoreCase("how are you")) {
                    if(voice != null)
                    {
                        voice.allocate();
                        System.out.println("voice rate: "+voice.getRate());
                        System.out.println("voice pitch: "+voice.getPitch());
                        System.out.println("Voice volume: "+voice.getVolume());
                        boolean status = voice.speak("i am good, what about you");
                        System.out.println("Status: "+status);
                        voice.deallocate();
                    }
                }



//what would you prefer tea or coffee
                else if(voiceCommand.equalsIgnoreCase("what would you prefer tea or coffee"))
                {
                    if(voice != null)
                    {
                        int max = 5;
                        int min = 1;
                        double v = (Math.random()*(max-min))+min;
                        switch ((int)v)
                        {
                            case 1:
                                voice.allocate();
                                System.out.println("voice rate: "+voice.getRate());
                                System.out.println("voice pitch: "+voice.getPitch());
                                System.out.println("Voice volume: "+voice.getVolume());
                                boolean status = voice.speak("i  dont like either of them. thank you !");
                                System.out.println("Status: "+status);
                                voice.deallocate();
                                break;
                            case 2:
                                voice.allocate();
                                System.out.println("voice rate: "+voice.getRate());
                                System.out.println("voice pitch: "+voice.getPitch());
                                System.out.println("Voice volume: "+voice.getVolume());
                                boolean statu = voice.speak("i  dont like either ");
                                System.out.println("Status: "+statu);
                                voice.deallocate();
                                break;
                            case 3:
                                voice.allocate();
                                System.out.println("voice rate: "+voice.getRate());
                                System.out.println("voice pitch: "+voice.getPitch());
                                System.out.println("Voice volume: "+voice.getVolume());
                                boolean stat = voice.speak("thank you !");
                                System.out.println("Status: "+stat);
                                voice.deallocate();
                                break;
                            case 4:
                                voice.allocate();
                                System.out.println("voice rate: "+voice.getRate());
                                System.out.println("voice pitch: "+voice.getPitch());
                                System.out.println("Voice volume: "+voice.getVolume());
                                boolean sta = voice.speak("i  like batteries");
                                System.out.println("Status: "+sta);
                                voice.deallocate();
                                break;
                            case 5:
                                voice.allocate();
                                System.out.println("voice rate: "+voice.getRate());
                                System.out.println("voice pitch: "+voice.getPitch());
                                System.out.println("Voice volume: "+voice.getVolume());
                                boolean sti = voice.speak("shut up.");
                                System.out.println("Status: "+sti);
                                voice.deallocate();
                                break;

                        }

                    }
                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}