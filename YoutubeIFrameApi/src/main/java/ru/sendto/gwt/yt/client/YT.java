package ru.sendto.gwt.yt.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.ScriptInjector;

import ru.sendto.gwt.client.util.Bus;

public class YT extends JavaScriptObject {
	public static class ApiReadyEvent {
		private ApiReadyEvent() {
		}

		static ApiReadyEvent i = new ApiReadyEvent();

		public static ApiReadyEvent get() {
			return i;
		}
	}

	public static class PleerReadyEvent {
		private PleerReadyEvent() {
		}

		static PleerReadyEvent i = new PleerReadyEvent();

		public static PleerReadyEvent get() {
			return i;
		}
	}

	public static class StateChangeEvent {
		private StateChangeEvent() {
		}

		static StateChangeEvent i = new StateChangeEvent();

		public static StateChangeEvent get() {
			return i;
		}
	}

	public static class PlaybackQualityChangeEvent {
		private PlaybackQualityChangeEvent() {
		}

		static PlaybackQualityChangeEvent i = new PlaybackQualityChangeEvent();

		public static PlaybackQualityChangeEvent get() {
			return i;
		}
	}

	public static class ErrorEvent {
		private ErrorEvent() {
		}

		static ErrorEvent i = new ErrorEvent();

		public static ErrorEvent get() {
			return i;
		}
	}

	public static class ApiChangeEvent {
		private ApiChangeEvent() {
		}

		static ApiChangeEvent i = new ApiChangeEvent();

		public static ApiChangeEvent get() {
			return i;
		}
	}

	public static class PlaybackRateChangeEvent {
		private PlaybackRateChangeEvent() {
		}

		static PlaybackRateChangeEvent i = new PlaybackRateChangeEvent();

		public static PlaybackRateChangeEvent get() {
			return i;
		}
	}

	public static class Event extends JavaScriptObject {
		protected Event() {
		}

		final public native Player getTarget()/*-{
			return this.target;
		}-*/;

		final public native String getData()/*-{
			return this.data;
		}-*/;

	}

	protected YT() {
	}

	static public native YT get()/*-{
		if (!($wnd.YT)) {
			@ru.sendto.gwt.yt.client.YT::load()();
		}
		return $wnd.YT;
	}-*/;

	static private void load() {
		init();
		ScriptInjector.fromUrl("https://www.youtube.com/iframe_api");
	};

	static public class PlayerVars {

		public static PlayerVars getMinimal() {
			return new PlayerVars()
					.setAutoplay(false)
					.setDisablekb(true)
					.setControls(0)
					.setModestbranding(1)
					.setRel(false);
//					.setOrigin(origin);
		}

		public static PlayerVars getDefault() {
			return new PlayerVars();
		}

		/**
		 * This parameter specifies whether the initial video will automatically
		 * start to play when the player loads. Supported values are 0 or 1. The
		 * default value is 0.
		 * 
		 */
		final public native PlayerVars setAutoplay(boolean autoplay)/*-{
			this.autoplay = autoplay?1:0;
			return this;
		}-*/;

		/**
		 * Setting the parameter's value to 1 causes closed captions to be shown
		 * by default, even if the user has turned captions off. The default
		 * behavior is based on user preference.
		 * 
		 */
		final public native PlayerVars setCcLoadPolicy(int cc_load_policy)/*-{
			this.cc_load_policy = cc_load_policy;
			return this;
		}-*/;

		/**
		 * This parameter specifies the color that will be used in the player's
		 * video progress bar to highlight the amount of the video that the
		 * viewer has already seen. Valid parameter values are red and white,
		 * and, by default, the player uses the color red in the video progress
		 * bar. See the YouTube API blog for more information about color
		 * options.
		 * 
		 * Note: Setting the color parameter to white will disable the
		 * modestbranding option.
		 * 
		 */
		final public native PlayerVars setColor(String color)/*-{
			this.color = color;
			return this;
		}-*/;

		/**
		 * This parameter indicates whether the video player controls are
		 * displayed. For IFrame embeds that load a Flash player, it also
		 * defines when the controls display in the player as well as when the
		 * player will load. Supported values are: controls=0 – Player controls
		 * do not display in the player. For IFrame embeds, the Flash player
		 * loads immediately. controls=1 (default) – Player controls display in
		 * the player. For IFrame embeds, the controls display immediately and
		 * the Flash player also loads immediately. controls=2 – Player controls
		 * display in the player. For IFrame embeds, the controls display and
		 * the Flash player loads after the user initiates the video playback.
		 * Note: The parameter values 1 and 2 are intended to provide an
		 * identical user experience, but controls=2 provides a performance
		 * improvement over controls=1 for IFrame embeds. Currently, the two
		 * values still produce some visual differences in the player, such as
		 * the video title's font size. However, when the difference between the
		 * two values becomes completely transparent to the user, the default
		 * parameter value may change from 1 to 2.
		 * 
		 * 
		 */
		final public native PlayerVars setControls(int controls)/*-{
			this.controls = controls;
			return this;
		}-*/;

		/**
		 * Setting the parameter's value to 1 causes the player to not respond
		 * to keyboard controls. The default value is 0, which means that
		 * keyboard controls are enabled. Currently supported keyboard controls
		 * are: Spacebar or [k]: Play / Pause Arrow Left: Jump back 5 seconds in
		 * the current video Arrow Right: Jump ahead 5 seconds in the current
		 * video Arrow Up: Volume up Arrow Down: Volume Down [f]: Toggle
		 * full-screen display [j]: Jump back 10 seconds in the current video
		 * [l]: Jump ahead 10 seconds in the current video [m]: Mute or unmute
		 * the video [0-9]: Jump to a point in the video. 0 jumps to the
		 * beginning of the video, 1 jumps to the point 10% into the video, 2
		 * jumps to the point 20% into the video, and so forth.
		 * 
		 */
		final public native PlayerVars setDisablekb(boolean disablekb)/*-{
			this.disablekb = disablekb?1:0;
			return this;
		}-*/;

		/**
		 * Setting the parameter's value to 1 enables the player to be
		 * controlled via IFrame or JavaScript Player API calls. The default
		 * value is 0, which means that the player cannot be controlled using
		 * those APIs.
		 * 
		 * For more information on the IFrame API and how to use it, see the
		 * IFrame API documentation. (The JavaScript Player API has already been
		 * deprecated.)
		 * 
		 */
		final public native PlayerVars setEnablejsapi(boolean enablejsapi)/*-{
			this.enablejsapi = enablejsapi?1:0;
			return this;
		}-*/;

		/**
		 * This parameter specifies the time, measured in seconds from the start
		 * of the video, when the player should stop playing the video. The
		 * parameter value is a positive integer.
		 * 
		 * Note that the time is measured from the beginning of the video and
		 * not from either the value of the start player parameter or the
		 * startSeconds parameter, which is used in YouTube Player API functions
		 * for loading or queueing a video.
		 * 
		 */
		final public native PlayerVars setEnd(double end)/*-{
			this.end = end;
			return this;
		}-*/;

		/**
		 * Setting this parameter to 0 prevents the fullscreen button from
		 * displaying in the player. The default value is 1, which causes the
		 * fullscreen button to display.
		 * 
		 */
		final public native PlayerVars setFs(boolean fs)/*-{
			this.fs = fs?1:0;
			return this;
		}-*/;

		/**
		 * Sets the player's interface language. The parameter value is an ISO
		 * 639-1 two-letter language code or a fully specified locale. For
		 * example, fr and fr-ca are both valid values. Other language input
		 * codes, such as IETF language tags (BCP 47) might also be handled
		 * properly.
		 * 
		 * The interface language is used for tooltips in the player and also
		 * affects the default caption track. Note that YouTube might select a
		 * different caption track language for a particular user based on the
		 * user's individual language preferences and the availability of
		 * caption tracks.
		 * 
		 */
		final public native PlayerVars setHl(String hl)/*-{
			this.hl = hl;
			return this;
		}-*/;

		/**
		 * Setting the parameter's value to 1 causes video annotations to be
		 * shown by default, whereas setting to 3 causes video annotations to
		 * not be shown by default. The default value is 1.
		 * 
		 */
		final public native PlayerVars setIvLoadPolicy(int iv_load_policy)/*-{
			this.iv_load_policy = iv_load_policy;
			return this;
		}-*/;

		/**
		 * The list parameter, in conjunction with the listType parameter,
		 * identifies the content that will load in the player. If the listType
		 * parameter value is search, then the list parameter value specifies
		 * the search query. If the listType parameter value is user_uploads,
		 * then the list parameter value identifies the YouTube channel whose
		 * uploaded videos will be loaded. If the listType parameter value is
		 * playlist, then the list parameter value specifies a YouTube playlist
		 * ID. In the parameter value, you need to prepend the playlist ID with
		 * the letters PL as shown in the example below.
		 * https://www.youtube.com/embed? listType=playlist
		 * &list=PLC77007E23FF423C6 Note: If you specify values for the list and
		 * listType parameters, the IFrame embed URL does not need to specify a
		 * video ID.
		 * 
		 * 
		 */
		final public native PlayerVars setList(String list)/*-{
			this.list = list;
			return this;
		}-*/;

		/**
		 * The listType parameter, in conjunction with the list parameter,
		 * identifies the content that will load in the player. Valid parameter
		 * values are playlist, search, and user_uploads.
		 * 
		 * If you specify values for the list and listType parameters, the
		 * IFrame embed URL does not need to specify a video ID.
		 * 
		 */
		final public native PlayerVars setListType(String listType)/*-{
			this.listType = listType;
			return this;
		}-*/;

		/**
		 * In the case of a single video player, a setting of 1 causes the
		 * player to play the initial video again and again. In the case of a
		 * playlist player (or custom player), the player plays the entire
		 * playlist and then starts again at the first video.
		 * 
		 * Supported values are 0 and 1, and the default value is 0.
		 * 
		 * Note: This parameter has limited support in the AS3 player and in
		 * IFrame embeds, which could load either the AS3 or HTML5 player.
		 * Currently, the loop parameter only works in the AS3 player when used
		 * in conjunction with the playlist parameter. To loop a single video,
		 * set the loop parameter value to 1 and set the playlist parameter
		 * value to the same video ID already specified in the Player API URL:
		 * https://www.youtube.com/v/VIDEO_ID? version=3 &loop=1
		 * &playlist=VIDEO_ID
		 * 
		 */
		final public native PlayerVars setLoop(boolean loop)/*-{
			this.loop = loop?1:0;
			return this;
		}-*/;

		/**
		 * This parameter lets you use a YouTube player that does not show a
		 * YouTube logo. Set the parameter value to 1 to prevent the YouTube
		 * logo from displaying in the control bar. Note that a small YouTube
		 * text label will still display in the upper-right corner of a paused
		 * video when the user's mouse pointer hovers over the player.
		 * 
		 */
		final public native PlayerVars setModestbranding(int modestbranding)/*-{
			this.modestbranding = modestbranding;
			return this;
		}-*/;

		/**
		 * This parameter provides an extra security measure for the IFrame API
		 * and is only supported for IFrame embeds. If you are using the IFrame
		 * API, which means you are setting the enablejsapi parameter value to
		 * 1, you should always specify your domain as the origin parameter
		 * value.
		 * 
		 */
		final public native PlayerVars setOrigin(String origin)/*-{
			this.origin = origin;
			return this;
		}-*/;

		/**
		 * This parameter specifies a comma-separated list of video IDs to play.
		 * If you specify a value, the first video that plays will be the
		 * VIDEO_ID specified in the URL path, and the videos specified in the
		 * playlist parameter will play thereafter.
		 * 
		 */
		final public native PlayerVars setPlaylist(String playlist)/*-{
			this.playlist = playlist;
			return this;
		}-*/;

		/**
		 * This parameter controls whether videos play inline or fullscreen in
		 * an HTML5 player on iOS. Valid values are: 0: This value causes
		 * fullscreen playback. This is currently the default value, though the
		 * default is subject to change. 1: This value causes inline playback
		 * for UIWebViews created with the allowsInlineMediaPlayback property
		 * set to TRUE.
		 * 
		 */
		final public native PlayerVars setPlaysinline(boolean playsinline)/*-{
			this.playsinline = playsinline?1:0;
			return this;
		}-*/;

		/**
		 * This parameter indicates whether the player should show related
		 * videos when playback of the initial video ends. Supported values are
		 * 0 and 1. The default value is 1.
		 * 
		 */
		final public native PlayerVars setRel(boolean rel)/*-{
			this.rel = rel?1:0;
			return this;
		}-*/;

		/**
		 * Supported values are 0 and 1.
		 * 
		 * Setting the parameter's value to 0 causes the player to not display
		 * information like the video title and uploader before the video starts
		 * playing.
		 * 
		 * If the player is loading a playlist, and you explicitly set the
		 * parameter value to 1, then, upon loading, the player will also
		 * display thumbnail images for the videos in the playlist. Note that
		 * this functionality is only supported for the AS3 player.
		 * 
		 */
		final public native PlayerVars setShowinfo(boolean showinfo)/*-{
			this.showinfo = showinfo?1:0;
			return this;
		}-*/;

		/**
		 * This parameter causes the player to begin playing the video at the
		 * given number of seconds from the start of the video. The parameter
		 * value is a positive integer. Note that similar to the seekTo
		 * function, the player will look for the closest keyframe to the time
		 * you specify. This means that sometimes the play head may seek to just
		 * before the requested time, usually no more than around two seconds.
		 * 
		 */
		final public native PlayerVars setStart(double start)/*-{
			this.start = start;
			return this;
		}-*/;

		/**
		 * This parameter identifies the URL where the player is embedded. This
		 * value is used in YouTube Analytics reporting when the YouTube player
		 * is embedded in a widget, and that widget is then embedded in a web
		 * page or application. In that scenario, the origin parameter
		 * identifies the widget provider's domain, but YouTube Analytics should
		 * not identify the widget provider as the actual traffic source.
		 * Instead, YouTube Analytics uses the widget_referrer parameter value
		 * to identify the domain associated with the traffic source.
		 * 
		 */
		final public native PlayerVars setWidgetReferrer(String widget_referrer)/*-{
			this.widget_referrer = widget_referrer;
			return this;
		}-*/;

	}

	public final native Player player(String elementId, String videoId, PlayerVars vars)/*-{
		return new YT.Player(elementId, 
			{videoId:videoId,
			playerVars:vars,
			events:{
				'onReady':@ru.sendto.gwt.yt.client.YT::firePleerReady(),
				'onStateChange':@ru.sendto.gwt.yt.client.YT::fireStateChange(),
				'onPlaybackQualityChange':@ru.sendto.gwt.yt.client.YT::firePlaybackQualityChange(),
				'onPlaybackRateChange':@ru.sendto.gwt.yt.client.YT::firePlaybackRateChange(),
				'onError':@ru.sendto.gwt.yt.client.YT::fireError(),
				'onApiChange':@ru.sendto.gwt.yt.client.YT::fireApiChange()
				
			}});
	}-*/;

	static private native void init()/*-{
		$wnd.onYouTubeIframeAPIReady=@ru.sendto.gwt.yt.client.YT::fireEventOnAPIReady()();
	}-*/;

	static private void fireEventOnAPIReady() {
		Bus.get().fire(ApiReadyEvent.get());
	}

	static private void firePleerReady(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(PleerReadyEvent.get());
	}

	static private void fireStateChange(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(StateChangeEvent.get());
	}

	static private void firePlaybackQualityChange(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(PlaybackQualityChangeEvent.get());
	}

	static private void fireError(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(ErrorEvent.get());
	}

	static private void fireApiChange(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(ApiChangeEvent.get());
	}

	static private void firePlaybackRateChange(Event e) {
		Bus.getBy(e.getTarget().getPlayerId()).fire(PlaybackRateChangeEvent.get());
	}

}
