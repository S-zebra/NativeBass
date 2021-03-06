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

package jouvieje.bass.defines;

/**
 * Error codes returned by BASS_ErrorGetCode [NAME] BASS_ERROR
 */
public interface BASS_ERROR {
	/** all is OK */
	public static final int BASS_OK = 0;
	/** memory error */
	public static final int BASS_ERROR_MEM = 1;
	/** can't open the file */
	public static final int BASS_ERROR_FILEOPEN = 2;
	/** can't find a free/valid driver */
	public static final int BASS_ERROR_DRIVER = 3;
	/** the sample buffer was lost */
	public static final int BASS_ERROR_BUFLOST = 4;
	/** invalid handle */
	public static final int BASS_ERROR_HANDLE = 5;
	/** unsupported sample format */
	public static final int BASS_ERROR_FORMAT = 6;
	/** invalid position */
	public static final int BASS_ERROR_POSITION = 7;
	/** BASS_Init has not been successfully called */
	public static final int BASS_ERROR_INIT = 8;
	/** BASS_Start has not been successfully called */
	public static final int BASS_ERROR_START = 9;
	/** already initialized/paused/whatever */
	public static final int BASS_ERROR_ALREADY = 14;
	/** can't get a free channel */
	public static final int BASS_ERROR_NOCHAN = 18;
	/** an illegal type was specified */
	public static final int BASS_ERROR_ILLTYPE = 19;
	/** an illegal parameter was specified */
	public static final int BASS_ERROR_ILLPARAM = 20;
	/** no 3D support */
	public static final int BASS_ERROR_NO3D = 21;
	/** no EAX support */
	public static final int BASS_ERROR_NOEAX = 22;
	/** illegal device number */
	public static final int BASS_ERROR_DEVICE = 23;
	/** not playing */
	public static final int BASS_ERROR_NOPLAY = 24;
	/** illegal sample rate */
	public static final int BASS_ERROR_FREQ = 25;
	/** the stream is not a file stream */
	public static final int BASS_ERROR_NOTFILE = 27;
	/** no hardware voices available */
	public static final int BASS_ERROR_NOHW = 29;
	/** the MOD music has no sequence data */
	public static final int BASS_ERROR_EMPTY = 31;
	/** no internet connection could be opened */
	public static final int BASS_ERROR_NONET = 32;
	/** couldn't create the file */
	public static final int BASS_ERROR_CREATE = 33;
	/** effects are not available */
	public static final int BASS_ERROR_NOFX = 34;
	/** requested data is not available */
	public static final int BASS_ERROR_NOTAVAIL = 37;
	/** the channel is a "decoding channel" */
	public static final int BASS_ERROR_DECODE = 38;
	/** a sufficient DirectX version is not installed */
	public static final int BASS_ERROR_DX = 39;
	/** connection timedout */
	public static final int BASS_ERROR_TIMEOUT = 40;
	/** unsupported file format */
	public static final int BASS_ERROR_FILEFORM = 41;
	/** unavailable speaker */
	public static final int BASS_ERROR_SPEAKER = 42;
	/** invalid BASS version (used by add-ons) */
	public static final int BASS_ERROR_VERSION = 43;
	/** codec is not available/supported */
	public static final int BASS_ERROR_CODEC = 44;
	/** the channel/file has ended */
	public static final int BASS_ERROR_ENDED = 45;
	/** the device is busy */
	public static final int BASS_ERROR_BUSY = 46;
	/** some other mystery problem */
	public static final int BASS_ERROR_UNKNOWN = -1;
	/** ACM codec selection cancelled */
	public static final int BASS_ERROR_ACM_CANCEL = 2000;
	/** access denied (invalid password) */
	public static final int BASS_ERROR_CAST_DENIED = 2100;
	/** Not a decoding channel */
	public static final int BASS_ERROR_FX_NODECODE = 4000;
	/** BPM/Beat detection is in use */
	public static final int BASS_ERROR_FX_BPMINUSE = 4001;
}