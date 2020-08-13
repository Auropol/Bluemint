package me.auropol.bluemint.primitive;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public interface Networker {
    FileChannel getChannel();
    long getPort();
     static Networker downloadFileFrom(String url, String name) {
         try(FileOutputStream stream = new FileOutputStream(name)) {
             ReadableByteChannel readableByteChannel = Channels.newChannel(new URL(url).openStream());
             FileChannel fileChannel = stream.getChannel();
             long port = stream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
             return new Networker() {
                 @Override
                 public FileChannel getChannel() {
                     return fileChannel;
                 }

                 @Override
                 public long getPort() {
                     return port;
                 }
             };

         } catch (IOException e) {
             e.printStackTrace();
         }
         throw new NullPointerException();
     }
}
