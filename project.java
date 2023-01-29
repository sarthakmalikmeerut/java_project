import java.io.IOException;

import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;

public class project {

    public static void main(String[] st) {

        Configuration config = new Configuration();

        config.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("3269.dic");
        config.setLanguageModelPath("3269.lm");

        try {
            LiveSpeechRecognizer speech = new LiveSpeechRecognizer(config);
            speech.startRecognition(true);

            SpeechResult speechResult = null;

            while ((speechResult = speech.getResult()) != null) {
                String voiceCommand = speechResult.getHypothesis();
                System.out.println("Voice Command is " + voiceCommand);

                if (voiceCommand.equalsIgnoreCase("Open Chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c start chrome https://www.google.com/maps/@31.3377466,75.6082797,16z");
                } else if (voiceCommand.equalsIgnoreCase("Close Chrome")) {
                    Runtime.getRuntime().exec("cmd.exe /c TASKKILL /IM chrome.exe");
                } else if (voiceCommand.equalsIgnoreCase("open 5")) {
                    Runtime.getRuntime().exec("cmd.exe /c  \"C:\\Grand Theft Auto V\\GTA5.exe\"");

                }

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}