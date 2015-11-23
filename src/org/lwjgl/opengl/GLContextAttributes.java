package org.lwjgl.opengl;

/**
 * Represents all attributes used for context creation.
 * 
 * @author Kai Burjack
 */
public class GLContextAttributes {

    /**
     * Constant for the core profile. This is only valid when ({@link #majorVersion}.{@link #minorVersion}) is at least 3.2.
     * 
     * @see #profile
     */
    public static final int OPENGL_CORE_PROFILE = 1;
    /**
     * Constant for the compatibility profile.
     * 
     * @see #profile
     */
    public static final int OPENGL_COMPATIBILITY_PROFILE = 2;

    /**
     * Constant for doing nothing on context switch.
     * 
     * @see #contextReleaseBehavior
     */
    public static final int CONTEXT_RELEASE_BEHAVIOR_NONE = 1;
    /**
     * Constant for flushing GL pipeline on context switch.
     * 
     * @see #contextReleaseBehavior
     */
    public static final int CONTEXT_RELEASE_BEHAVIOR_FLUSH = 2;

    /**
     * Whether to use double-buffering. It defaults to <code>true</code>.
     */
    public boolean doubleBuffer = true;
    /**
     * Whether to use different LEFT and RIGHT backbuffers for stereo rendering. It defaults to <code>false</code>.
     */
    public boolean stereo;
    /**
     * The number of bits for the red color channel. It defaults to 8.
     */
    public int redSize = 8;
    /**
     * The number of bits for the green color channel. It defaults to 8.
     */
    public int greenSize = 8;
    /**
     * The number of bits for the blue color channel. It defaults to 8.
     */
    public int blueSize = 8;
    /**
     * The number of bits for the alpha color channel. It defaults to 8.
     */
    public int alphaSize = 8;
    /**
     * The number of bits for the depth channel. It defaults to 24.
     */
    public int depthSize = 24;
    /**
     * The number of bits for the stencil channel. It defaults to 0.
     */
    public int stencilSize = 8;
    /**
     * The number of bits for the red accumulator color channel. It defaults to 0.
     */
    public int accumRedSize;
    /**
     * The number of bits for the green accumulator color channel. It defaults to 0.
     */
    public int accumGreenSize;
    /**
     * The number of bits for the blue accumulator color channel. It defaults to 0.
     */
    public int accumBlueSize;
    /**
     * The number of bits for the alpha accumulator color channel. It defaults to 0.
     */
    public int accumAlphaSize;
    public int sampleBuffers;
    public int samples;
    public long shareContext;

    /**
     * The major GL context version to use. It defaults to 0 for "not specified", in which case it is up to the driver which version will be available.
     * <p>
     * On Windows this is typically the most recent supported version. On OSX this might be 2.1.
     */
    public int majorVersion;
    /**
     * The minor GL context version to use. If {@link #majorVersion} is 0 this field is unused.
     */
    public int minorVersion;
    /**
     * Whether a forward-compatible context should be created. This has only an effect when ({@link #majorVersion}.{@link #minorVersion}) is at least 3.2.
     */
    public boolean forwardCompatible;
    /**
     * The profile to use. Defaults to 0, which means "not specified".
     */
    public int profile;
    /**
     * Whether a debug context should be requested.
     */
    public boolean debug;
    /**
     * Set the swap interval.
     */
    public Integer swapInterval;
    /**
     * Whether to use sRGB color space.
     */
    public boolean sRGB;
    /**
     * Whether to use a floating point pixel format.
     */
    public boolean floatPixelFormat;
    /**
     * Specify the behavior on context switch.
     */
    public int contextReleaseBehavior;

}
