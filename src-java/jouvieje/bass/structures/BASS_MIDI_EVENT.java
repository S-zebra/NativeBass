/* DO NOT EDIT - AUTOGENERATED */
/**
 * 				NativeBass Project
 *
 * Want to use BASS (www.un4seen.com) in the Java language ? NativeBass is made for you.
 * Copyright @ 2007-2011 Jérôme Jouvie
 *
 * Created on 02 jul. 2007
 * @version file v1.1.1
 * @author Jérôme Jouvie (Jouvieje)
 * @site   http://jerome.jouvie.free.fr/
 * @mail   jerome.jouvie@gmail.com
 * 
 * 
 * INTRODUCTION
 * BASS is an audio library for use in Windows and Mac OSX software.
 * Its purpose is to provide developers with the most powerful and
 * efficient (yet easy to use), sample, stream (MP3, MP2, MP1, OGG, WAV, AIFF,
 * custom generated, and more via add-ons), MOD music (XM, IT, S3M, MOD, MTM, UMX),
 * MO3 music (MP3/OGG compressed MODs),
 * and recording functions. All in a tiny DLL, under 100KB* in size.
 * 
 * BASS official web site :
 * 		http://www.un4seen.com/
 * 
 * 
 * GNU LESSER GENERAL PUBLIC LICENSE
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA 
 */

package jouvieje.bass.structures;

import jouvieje.bass.*;
import jouvieje.bass.exceptions.*;
import jouvieje.bass.callbacks.*;
import jouvieje.bass.*;
import jouvieje.bass.defines.*;
import jouvieje.bass.enumerations.*;
import jouvieje.bass.structures.*;
import java.nio.*;
import jouvieje.bass.*;
import jouvieje.bass.enumerations.*;
import jouvieje.bass.structures.*;
import jouvieje.bass.utils.*;

public class BASS_MIDI_EVENT extends Pointer {
	/**
	 * Create a view of the <code>Pointer</code> object as a <code>BASS_MIDI_EVENT</code> object.<br>
	 * This view is valid only if the memory holded by the <code>Pointer</code> holds a BASS_MIDI_EVENT object.
	 */
	public static BASS_MIDI_EVENT asBASS_MIDI_EVENT(Pointer pointer) {
		long address = Pointer.getPointer(pointer);
		if(address == 0) return null;
		return new BASS_MIDI_EVENT(address);
	}
	/**
	 * Allocate a new <code>BASS_MIDI_EVENT</code>.<br>
	 * The call <code>isNull()</code> on the object created will return false.<br>
	 * <pre><code>  BASS_MIDI_EVENT obj = BASS_MIDI_EVENT.allocate();
	 *  (obj == null) <=> obj.isNull() <=> false
	 * </code></pre>
	 */
	public static BASS_MIDI_EVENT allocate() {
		final long pointer = StructureJNI.BASS_MIDI_EVENT_new();
		if(pointer == 0) throw new OutOfMemoryError();
		return new BASS_MIDI_EVENT(pointer);
	}

	protected BASS_MIDI_EVENT(long pointer) {
		super(pointer);
	}

	/**
	 * Create an object that holds a null <code>BASS_MIDI_EVENT</code>.<br>
	 * The call <code>isNull()</code> on the object created will returns true.<br>
	 * <pre><code>  BASS_MIDI_EVENT obj = new BASS_MIDI_EVENT();
	 *  (obj == null) <=> false
	 *  obj.isNull() <=> true
	 * </code></pre>
	 * To creates a new <code>BASS_MIDI_EVENT</code>, use the static "constructor" :
	 * <pre><code>  BASS_MIDI_EVENT obj = BASS_MIDI_EVENT.allocate();</code></pre>
	 * @see BASS_MIDI_EVENT#allocate()
	 */
	public BASS_MIDI_EVENT() {
		super();
	}

	public void release() {
		if(pointer != 0) {
			StructureJNI.BASS_MIDI_EVENT_delete(pointer);
		}
		pointer = 0;
	}

	/**
	 * MIDI_EVENT_xxx
	 */
	public int getEvent() {
		if(pointer == 0) throw new NullPointerException();
		int javaResult = StructureJNI.BASS_MIDI_EVENT_get_event(pointer);
		return javaResult;
	}
	/**
	 * MIDI_EVENT_xxx
	 */
	public void setEvent(int event) {
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_MIDI_EVENT_set_event(pointer, event);
	}

	/**
	 * 
	 */
	public int getParam() {
		if(pointer == 0) throw new NullPointerException();
		int javaResult = StructureJNI.BASS_MIDI_EVENT_get_param(pointer);
		return javaResult;
	}
	/**
	 * 
	 */
	public void setParam(int param) {
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_MIDI_EVENT_set_param(pointer, param);
	}

	/**
	 * 
	 */
	public int getChan() {
		if(pointer == 0) throw new NullPointerException();
		int javaResult = StructureJNI.BASS_MIDI_EVENT_get_chan(pointer);
		return javaResult;
	}
	/**
	 * 
	 */
	public void setChan(int chan) {
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_MIDI_EVENT_set_chan(pointer, chan);
	}

	/**
	 * event position (ticks)
	 */
	public int getTick() {
		if(pointer == 0) throw new NullPointerException();
		int javaResult = StructureJNI.BASS_MIDI_EVENT_get_tick(pointer);
		return javaResult;
	}
	/**
	 * event position (ticks)
	 */
	public void setTick(int tick) {
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_MIDI_EVENT_set_tick(pointer, tick);
	}

	/**
	 * event position (bytes)
	 */
	public int getPos() {
		if(pointer == 0) throw new NullPointerException();
		int javaResult = StructureJNI.BASS_MIDI_EVENT_get_pos(pointer);
		return javaResult;
	}
	/**
	 * event position (bytes)
	 */
	public void setPos(int pos) {
		if(pointer == 0) throw new NullPointerException();
		StructureJNI.BASS_MIDI_EVENT_set_pos(pointer, pos);
	}

}