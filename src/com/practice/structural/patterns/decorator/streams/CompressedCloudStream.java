package com.practice.structural.patterns.decorator.streams;

public class CompressedCloudStream implements Stream {
    private Stream stream;

    public CompressedCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var compressedData = compress(data);
        stream.write(compressedData); //Composition

    }

    private String compress(String data){
        return data.substring(0,5); // For simplicity, imaging this is our compression algorithm
    }
}
