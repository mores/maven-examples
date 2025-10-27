package org.test;

public class MetaListener implements javax.sound.midi.MetaEventListener {
    private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MetaListener.class);

    @Override
    public void meta(javax.sound.midi.MetaMessage meta) {

        log.info("Type: " + meta.getType());
    }
}
