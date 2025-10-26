package org.test;

import midireader.*;
import midireader.midievent.*;
import midireader.midievent.MetaMidiEvent.MetaEventType;

import org.junit.Test;

public class MidiTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( MidiTest.class );

	public void testThree() throws Exception
	{
		log.info( "testThree - hear music" );

		java.io.File file = new java.io.File( "src/test/resources/Exit_Music.mid" );	

		javax.sound.midi.Sequencer sequencer = javax.sound.midi.MidiSystem.getSequencer();
		log.info( "Sequencer: " + sequencer );
		sequencer.open();

		javax.sound.midi.Sequence sequence = javax.sound.midi.MidiSystem.getSequence( file );
		sequencer.setSequence(sequence);
 
		sequencer.start();

		Thread.sleep( 50000 );
	}

	@Test
	public void testTwo() throws Exception
        {
                log.info( "testTwo" );
	
		MidiReader reader = new MidiReader("src/test/resources/Exit_Music.mid");
		try
		{
		    MidiFileInfo midiFileInfo = reader.getMidiFileInfo();
		    for (MidiEvent nextEvent : reader)
		    {
			long delayMillis = nextEvent.getDeltaTime() * midiFileInfo.getMicrosecondsPerTick() / 1000;
			log.info( "Sleep: " + delayMillis );
			Thread.sleep(delayMillis);

			log.info( "NE: " + nextEvent );
			if ((nextEvent instanceof MetaMidiEvent) )
			{
			    log.info(((MetaMidiEvent) nextEvent).getContentAsString());
			}
		    }
		}
		finally
		{
		    try
		    {
			reader.close();
		    } 
		    catch (java.io.IOException e) {}
		}
	}

        public void testOne() throws Exception
        {
                log.info( "testOne" );

		int NOTE_ON = 0x90;
		int NOTE_OFF = 0x80;
		String[] NOTE_NAMES = {"C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B"};

		java.io.File file = new java.io.File( "src/test/resources/Am_I_Blue_AB.mid" );

		javax.sound.midi.Sequence sequence = javax.sound.midi.MidiSystem.getSequence( file );

		int trackNumber = 0;
		for( javax.sound.midi.Track track :  sequence.getTracks())
		{
			trackNumber++;
			log.info("Track " + trackNumber + ": size = " + track.size());
		
			for( int i=0; i < track.size(); i++)
			{ 
				javax.sound.midi.MidiEvent event = track.get(i);
                		log.info("@" + event.getTick() + " ");
				javax.sound.midi.MidiMessage message = event.getMessage();

				if (message instanceof javax.sound.midi.ShortMessage)
				{
					javax.sound.midi.ShortMessage sm = (javax.sound.midi.ShortMessage) message;
					log.info("Channel: " + sm.getChannel() + " ");
					if (sm.getCommand() == NOTE_ON)
					{
						int key = sm.getData1();
						int octave = (key / 12)-1;
						int note = key % 12;
						String noteName = NOTE_NAMES[note];
						int velocity = sm.getData2();
						log.info("Note on, " + noteName + octave + " key=" + key + " velocity: " + velocity);
					}
					else if (sm.getCommand() == NOTE_OFF)
					{
						int key = sm.getData1();
						int octave = (key / 12)-1;
						int note = key % 12;
						String noteName = NOTE_NAMES[note];
						int velocity = sm.getData2();
						log.info("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
					}
					else
					{
						log.warn("Command:" + sm.getCommand());
					}
				}
				else
				{
					log.warn("Other message: " + message.getClass());
				}
			}
		}
	}
}
