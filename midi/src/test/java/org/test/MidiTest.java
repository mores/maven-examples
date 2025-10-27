package org.test;

import midireader.*;
import midireader.midievent.*;
import midireader.midievent.MetaMidiEvent.MetaEventType;

import org.junit.Test;

public class MidiTest {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MidiTest.class);

    @Test
    public void testThree() throws Exception {
        log.info("testThree - hear music");

        javax.sound.midi.Synthesizer synthesizer = javax.sound.midi.MidiSystem.getSynthesizer();
        synthesizer.open();

        // java.io.File soundFontFile = new java.io.File("src/test/resources/FluidR3.sf3");
        // java.io.File soundFontFile = new java.io.File("src/test/resources/Fireninja_s_Kayserburg_Piano.sf2");
        // javax.sound.midi.Soundbank sounbank = javax.sound.midi.MidiSystem.getSoundbank(soundFontFile);
        // synthesizer.loadAllInstruments(sounbank);

        javax.sound.midi.Instrument[] instruments = synthesizer.getLoadedInstruments();
        for (javax.sound.midi.Instrument instrument : instruments) {
            log.info(instrument + "\t" + instrument.getPatch().getBank() + "\t" + instrument.getPatch().getProgram());
        }

        java.io.File file = new java.io.File("src/test/resources/Exit_Music.mid");

        javax.sound.midi.Sequencer sequencer = javax.sound.midi.MidiSystem.getSequencer();
        log.info("Sequencer: " + sequencer);
        sequencer.open();

        sequencer.addMetaEventListener(new MetaListener());

        javax.sound.midi.Sequence sequence = javax.sound.midi.MidiSystem.getSequence(file);

        for (javax.sound.midi.Track track : sequence.getTracks()) {
            for (int i = 0; i < track.size(); i++) {
                javax.sound.midi.MidiEvent event = track.get(i);
                javax.sound.midi.MidiMessage message = event.getMessage();

                if (message instanceof javax.sound.midi.ShortMessage) {
                    javax.sound.midi.ShortMessage sm = (javax.sound.midi.ShortMessage) message;
                    if (sm.getCommand() == javax.sound.midi.ShortMessage.PROGRAM_CHANGE) {
                        // Get the current instrument (program number)
                        int currentInstrument = sm.getData1();
                        log.info("Found Program Change on channel " + sm.getChannel() + " for instrument: "
                                + currentInstrument);

                        // Set the new instrument (e.g., 0 for Acoustic Grand Piano)
                        int newInstrument = 1; // Replace with your desired instrument number
                        sm.setMessage(javax.sound.midi.ShortMessage.PROGRAM_CHANGE, sm.getChannel(), newInstrument, 0);
                    }
                }
            }
        }

        sequencer.setSequence(sequence);

        sequencer.start();

        Thread.sleep(50000);
    }

    public void testTwo() throws Exception {
        log.info("testTwo");

        int minNote = 999;
        int maxNote = -999;

        MidiReader reader = new MidiReader("src/test/resources/Exit_Music.mid");
        try {
            MidiFileInfo midiFileInfo = reader.getMidiFileInfo();
            for (MidiEvent nextEvent : reader) {
                long delayMillis = nextEvent.getDeltaTime() * midiFileInfo.getMicrosecondsPerTick() / 1000;
                log.info("Sleep: " + delayMillis);
                // Thread.sleep(delayMillis);

                log.info("NE: " + nextEvent);
                if (nextEvent instanceof midireader.midievent.NoteMidiEvent) {
                    midireader.midievent.NoteMidiEvent note = (midireader.midievent.NoteMidiEvent) nextEvent;
                    log.info("Channel:" + note.getChannel().getChannelNumber() + " Note: " + note.getNoteNumber());

                    if (note.getNoteNumber() > maxNote) {
                        maxNote = note.getNoteNumber();
                    }

                    if (note.getNoteNumber() < minNote) {
                        minNote = note.getNoteNumber();
                    }
                } else if (nextEvent instanceof MetaMidiEvent) {
                    log.info(((MetaMidiEvent) nextEvent).getContentAsString());
                }
            }

            log.info("Min Note: " + minNote);
            log.info("Max Note: " + maxNote);
        } finally {
            try {
                reader.close();
            } catch (java.io.IOException e) {
            }
        }
    }

    public void testOne() throws Exception {
        log.info("testOne");

        int NOTE_ON = 0x90;
        int NOTE_OFF = 0x80;
        String[] NOTE_NAMES = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };

        java.io.File file = new java.io.File("src/test/resources/ExitMusic.mid");

        javax.sound.midi.Sequence sequence = javax.sound.midi.MidiSystem.getSequence(file);

        int trackNumber = 0;
        for (javax.sound.midi.Track track : sequence.getTracks()) {
            trackNumber++;
            log.info("Track " + trackNumber + ": size = " + track.size());

            for (int i = 0; i < track.size(); i++) {
                javax.sound.midi.MidiEvent event = track.get(i);
                log.info("@" + event.getTick() + " ");
                javax.sound.midi.MidiMessage message = event.getMessage();

                if (message instanceof javax.sound.midi.ShortMessage) {
                    javax.sound.midi.ShortMessage sm = (javax.sound.midi.ShortMessage) message;
                    log.info("Channel: " + sm.getChannel() + " ");
                    if (sm.getCommand() == NOTE_ON) {
                        int key = sm.getData1();
                        int octave = (key / 12) - 1;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();
                        log.info("Note on, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                    } else if (sm.getCommand() == NOTE_OFF) {
                        int key = sm.getData1();
                        int octave = (key / 12) - 1;
                        int note = key % 12;
                        String noteName = NOTE_NAMES[note];
                        int velocity = sm.getData2();
                        log.info("Note off, " + noteName + octave + " key=" + key + " velocity: " + velocity);
                    } else {
                        log.warn("Command:" + sm.getCommand());
                    }
                } else {
                    log.warn("Other message: " + message.getClass());
                }
            }
        }
    }
}
