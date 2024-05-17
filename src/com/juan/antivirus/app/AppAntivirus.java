package com.juan.antivirus.app;

import com.juan.antivirus.dominio.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class AppAntivirus {
    public static void main(String[] args) {
        Antivirus avast = new Antivirus();

        DocumentoWord word1 = new DocumentoWord("hojadevida.docx");
        DocumentoWord word2 = new DocumentoWord("hojadevida☠️.docx");
        DocumentoPDF pdf1 = new DocumentoPDF("hojadevida.pdf");
        App app1 = new Android("Meta", 10);
        App app2 = new Ios("Gmail", 16.5);
        Video video1 = new Mp4("miprimeracomunion.mp4", 320);
        Video video2 = new VLC("segundaboda.mp3", 320);
        Ejecutable exe1 = new Windows("IntelliJIDEA", 1.19);
        Ejecutable exe2 = new Mac("Photoshop", 18);
        Audio audio1 = new Mp3("brunomars.mp3", LocalDate.of(2024, 5, 16));
        Audio audio2 = new Flash("projectmanhattan.flash", LocalDate.of(2020, 2, 10));


        List<Viruseable> elementos = Arrays.asList(word1, word2, pdf1, app1, app2, video1, video2, exe1, exe2, audio1, audio2);
        avast.escanear(elementos);
    }
}
