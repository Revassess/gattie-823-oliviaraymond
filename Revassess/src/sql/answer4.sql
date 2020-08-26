SELECT u.username, f.categoryName, f.question, f.answer 
FROM app_user u
JOIN study_set ss
	ON u.user_id = ss.user_id
JOIN study_set_card 
	USING (study_set_id) JOIN flashcard f
		USING (flashcard_id) JOIN c category USING (category_id) 
WHERE u.user_id = (SELECT user_id FROM study_set WHERE study_set_id = 4);



