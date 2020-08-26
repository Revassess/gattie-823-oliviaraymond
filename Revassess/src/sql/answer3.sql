SELECT *  FROM app_user u
JOIN study_set ss
	ON u.user_id = ss.user_id 
WHERE user_id = '5';

