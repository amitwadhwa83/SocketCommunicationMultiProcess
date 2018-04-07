package com.sample.players;

/**
 * This class is entry point for launching/starting the process of message
 * communication between Player(s)
 *
 */
public class LaunchPlayer {
    public static final String INITIATOR = "INITIATOR";
    public static final String RECEIVER = "RECEIVER";

    public static void main(String args[]) {

	if (null == args || args.length < 1) {
	    System.out.println("Please provide atleast one value");
	    System.exit(-1);
	}

	for (String input : args) {
	    if (input.equalsIgnoreCase(INITIATOR)) {

		// Starting initiator
		Player initiator = new Player();
		initiator.startInitiator();
	    } else if (input.equalsIgnoreCase(RECEIVER)) {

		// Starting receiver
		Player receiver = new Player();
		receiver.startReceiver();
	    } else {
		System.out.println("Invalid input. Valid values : receiver/initiator");
	    }
	}
	System.out.println("Ending the communication");
    }
}