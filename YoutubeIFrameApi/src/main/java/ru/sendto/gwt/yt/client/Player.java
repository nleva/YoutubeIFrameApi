package ru.sendto.gwt.yt.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Player extends JavaScriptObject {

	static interface Quality {
		static String small = "small", medium = "medium", large = "large", hd720 = "hd720", hd1080 = "hd1080",
				highres = "highres", def = "default";
	}

	static public class VideoParams extends JavaScriptObject {
		protected VideoParams() {
		}

		static public native VideoParams get()/*-{
			return {};
		}-*/;

		
		final public native VideoParams setMediaContentUrl(String mediaContentUrl)/*-{
			this.mediaContentUrl = mediaContentUrl;
			return this;
		}-*/;

		final public native VideoParams setVideoId(String videoId)/*-{
			this.videoId = videoId;
			return this;
		}-*/;

		final public native VideoParams setStart(double start)/*-{
			this.startSeconds = start;
			return this;
		}-*/;

		final public native VideoParams setEnd(double end)/*-{
			this.endSeconds = end;
			return this;
		}-*/;

		final public native VideoParams setQuality(String quality)/*-{
			this.suggestedQuality = quality;
			return this;
		}-*/;

	}

	static public class VideoListParams extends JavaScriptObject {
		protected VideoListParams() {
		}

		static public native VideoListParams get()/*-{
			return {};
		}-*/;
		final public native VideoListParams setListType(String listType)/*-{
			this.listType = listType;
			return this;
		}-*/;

		final public native VideoListParams setList(String list)/*-{
			this.list = list;
			return this;
		}-*/;

		final public native VideoListParams setIndex(Number index)/*-{
			this.index = index;
			return this;
		}-*/;

		final public native VideoListParams setStartSeconds(Number startSeconds)/*-{
			this.startSeconds = startSeconds;
			return this;
		}-*/;

		final public native VideoListParams setSuggestedQuality(String suggestedQuality)/*-{
			this.suggestedQuality = suggestedQuality;
			return this;
		}-*/;
	}

	protected Player() {
	}

	// no doc
	// final public native void addCueRange()/*-{
	// return this.addCueRange();
	// }-*/;

	
	final public native Player cuePlaylist(VideoListParams params)/*-{
		this.cuePlaylist(params);
		return this;
	}-*/;

	
	final public native Player cueVideoById(VideoParams params)/*-{
		this.cueVideoById(params);
		return this;
	}-*/;

	
	final public native Player cueVideoByUrl(VideoParams params)/*-{
		this.cueVideoByUrl(params);
		return this;
	}-*/;

	// TODO no doc
	// final public native void getApiInterface()/*-{
	// return this.getApiInterface();
	// }-*/;

	
	final public native String[] getAvailablePlaybackRates()/*-{
		return this.getAvailablePlaybackRates();
	}-*/;

	
	final public native String[] getAvailableQualityLevels()/*-{
		return this.getAvailableQualityLevels();
	}-*/;

	
	final public native double getCurrentTime()/*-{
		return this.getCurrentTime();
	}-*/;

	
	final public native String getDebugText()/*-{
		return this.getDebugText();
	}-*/;

	
	final public native double getDuration()/*-{
		return this.getDuration();
	}-*/;

	// TODO no doc
	final public native double getMediaReferenceTime()/*-{
		return this.getMediaReferenceTime();
	}-*/;

	
	final public native String getPlaybackQuality()/*-{
		return this.getPlaybackQuality();
	}-*/;

	
	final public native String getPlaybackRate()/*-{
		return this.getPlaybackRate();
	}-*/;

	
	final public native int getPlayerState()/*-{
		return this.getPlayerState();
	}-*/;

	
	final public native String[] getPlaylist()/*-{
		return this.getPlaylist();
	}-*/;

	
	final public native String getPlaylistId()/*-{
		return this.getPlaylistId();
	}-*/;

	
	final public native int getPlaylistIndex()/*-{
		return this.getPlaylistIndex();
	}-*/;

	// TODO jso
	final public native JavaScriptObject getVideoData()/*-{
		return this.getVideoData();
	}-*/;

	
	final public native double getVideoLoadedFraction()/*-{
		return this.getVideoLoadedFraction();
	}-*/;
	
	final public native String getPlayerId()/*-{
		return this.getIframe().id;
	}-*/;

	
	final public native String getVideoUrl()/*-{
		return this.getVideoUrl();
	}-*/;

	
	final public native int getVolume()/*-{
		return this.getVolume();
	}-*/;

	
	final public native Player hideVideoInfo()/*-{
		this.hideVideoInfo();
		return this;
	}-*/;

	
	final public native boolean isMuted()/*-{
		return this.isMuted();
	}-*/;

	// TODO no doc
	final public native Player loadModule(String mod)/*-{
		this.loadModule(mod);
		return this;
	}-*/;

	
	final public native Player loadPlaylist(VideoListParams params)/*-{
		loadPlaylist(params);
		return this;
	}-*/;

	
	final public native void loadVideoById(VideoParams params)/*-{
		this.loadVideoById(params);
	}-*/;

	
	final public native Player loadVideoByUrl(VideoParams params)/*-{
		this.loadVideoByUrl(params);
		return this;
	}-*/;

	
	final public native Player mute()/*-{
		this.mute();
		return this;
	}-*/;

	
	final public native Player nextVideo()/*-{
		this.nextVideo();
		return this;
	}-*/;

	
	final public native Player pauseVideo()/*-{
		this.pauseVideo();
		return this;
	}-*/;

	
	final public native Player playVideo()/*-{
		this.playVideo();
		return this;
	}-*/;

	
	final public native Player playVideoAt(int videoInList)/*-{
		this.playVideoAt(videoInList);
		return this;
	}-*/;

	
	final public native Player previousVideo()/*-{
		this.previousVideo();
		return this;
	}-*/;

	//TODO no doc
//	final public native void removeCueRange()/*-{
//		return this.removeCueRange();
//	}-*/;

	// TODO is needed?
//	final public native void removeEventListener()/*-{
//		return this.removeEventListener();
//	}-*/;

	
	final public native Player seekTo(double seconds, boolean offline)/*-{
		this.seekTo(seconds, !offline);
		return this;
	}-*/;

	
	final public native Player setLoop(boolean loop)/*-{
		this.setLoop(loop);
		return this;
	}-*/;

	
	final public native Player setOption(String module, String option, String value)/*-{
		this.setOption(module, option, value);
		return this;
	}-*/;

	
	final public native Player setPlaybackQuality(String quality)/*-{
		this.setPlaybackQuality(quality);
		return this;
	}-*/;

	
	final public native Player setPlaybackRate(float rate)/*-{
		this.setPlaybackRate(rate);
		return this;
	}-*/;

	
	final public native Player setShuffle(boolean shuffle)/*-{
		this.setShuffle(shuffle);
		return this;
	}-*/;

	
	final public native Player setVolume(int vol)/*-{
		this.setVolume(vol);
		return this;
	}-*/;

	
	final public native Player showVideoInfo()/*-{
		this.showVideoInfo();
		return this;
	}-*/;

	
	final public native Player stopVideo()/*-{
		this.stopVideo();
		return this;
	}-*/;

	
	final public native Player unMute()/*-{
		this.unMute();
		return this;
	}-*/;

	// TODO no doc
	final public native Player unloadModule(String module)/*-{
		this.unloadModule(module);
		return this;
	}-*/;

}
