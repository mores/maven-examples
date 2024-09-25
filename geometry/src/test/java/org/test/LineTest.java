package org.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.numbers.core.Precision;
import org.apache.commons.geometry.euclidean.twod.Line;
import org.apache.commons.geometry.euclidean.twod.Lines;
import org.apache.commons.geometry.euclidean.twod.Segment;
import org.apache.commons.geometry.euclidean.twod.Vector2D;

import org.junit.jupiter.api.Test;

public class LineTest
{
        private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger( LineTest.class );

        @Test
        public void lineTest() throws Exception
        {
                log.info( "lineTest" );
		Precision.DoubleEquivalence precision = Precision.doubleEquivalenceOfEpsilon(1e-6);
		
		Segment segmenta = Lines.segmentFromPoints(Vector2D.ZERO, Vector2D.of(0, 75), precision);
		log.info( "Segment A: " + segmenta );
		splitSegment( segmenta, 15 );

		//
	        Segment segmentb = Lines.segmentFromPoints(Vector2D.ZERO, Vector2D.of(75, 0), precision);
                log.info( "Segment B: " + segmentb );
		splitSegment( segmentb, 15 );

		//
		Segment segmentc = Lines.segmentFromPoints(Vector2D.ZERO, Vector2D.of(75, 75), precision);
                log.info( "Segment C: " + segmentc );
                splitSegment( segmentc, 15 );
	}

	public void splitSegment(Segment segment, int numSegments) {

		Vector2D start = segment.getStartPoint();
		Vector2D end = segment.getEndPoint();
		Vector2D direction = end.subtract(start);

		double segmentLength = direction.norm() / numSegments;

		for (int i = 0; i < numSegments; i++) {
		    Vector2D newStart = start.add(direction.normalize().multiply(segmentLength * i));
		    Vector2D newEnd = start.add(direction.normalize().multiply(segmentLength * (i + 1)));

		    log.info( newStart + " x " + newEnd );
		}

	}

}
