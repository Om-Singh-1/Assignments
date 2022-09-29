package com.abstraction.inheritance.Q2;

public class BasicHeadphone extends Headphones implements HeadphoneProperties{

	@Override
	public void BuildQuality() {
		
		System.out.println("Plastic build");
		
	}

	@Override
	public void AudioEngine() {
		
		System.out.println("Dolby Atmos 5.0");
		
	}
	
	public void Bass() {
		System.out.println("Bass max output 40dB");
	}
	
	public static void main(String[] args) {
		
		BasicHeadphone basicheadphone = new BasicHeadphone();
		basicheadphone.AudioEngine();
		basicheadphone.Bass();
		basicheadphone.BuildQuality();
		
	}

}
