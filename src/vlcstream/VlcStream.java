/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlcstream;

import java.*;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.headless.HeadlessMediaPlayer;
import uk.co.caprica.vlcj.test.VlcjTest;

/**
 * An example of how to stream a media file over HTTP.
 * <p>
 * The client specifies an MRL of <code>http://127.0.0.1:5555</code>
 */
public class VlcStream extends VlcjTest {

  public static void main(String[] args) throws Exception {
    if(args.length != 1) {
      System.out.println("Specify a single MRL to stream");
      //System.exit(1);
    }
//
//    String media = args[0];
//    String options = formatHttpStream("127.0.0.1", 5555);
//
//    System.out.println("Streaming '" + media + "' to '" + options + "'");
//
//    MediaPlayerFactory mediaPlayerFactory = new MediaPlayerFactory(args);
//    HeadlessMediaPlayer mediaPlayer = mediaPlayerFactory.newHeadlessMediaPlayer();
//    mediaPlayer.playMedia(media, options);
//
//    // Don't exit
//    Thread.currentThread().join();
  }

  private static String formatHttpStream(String serverAddress, int serverPort) {
    StringBuilder sb = new StringBuilder(60);
    sb.append(":sout=#duplicate{dst=std{access=http,mux=ts,");
    sb.append("dst=");
    sb.append(serverAddress);
    sb.append(':');
    sb.append(serverPort);
    sb.append("}}");
    return sb.toString();
  }
}