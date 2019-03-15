package com.coll.dao;

import com.coll.model.ProfilePicture;

public interface ProfilePictureDAO {
	public void insertOrUpdateProfilePicture(ProfilePicture profilePicture);
	public ProfilePicture getProfilePicture(String username);
}
