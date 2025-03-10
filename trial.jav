function submitMood() {
    const moodRatingInput = document.getElementById('mood-rating');
    const moodFeedbackP = document.getElementById('mood-feedback');
    const moodRating = parseInt(moodRatingInput.value);

    if (isNaN(moodRating) || moodRating < 1 || moodRating > 5) {
        moodFeedbackP.textContent = "Please enter a valid rating between 1 and 5.";
    } else {
        let feedback = "";
        if (moodRating <= 2) {
            feedback = "It sounds like you're having a tough day. Remember, it's okay to not be okay. Consider reaching out to a friend, family member, or mental health professional for support. Explore the resources section for help.";
        } else if (moodRating === 3) {
            feedback = "You're feeling somewhat in the middle today. Take some time for self-care and check in with yourself later. ";
        } else if (moodRating >= 4) {
            feedback = "That's great to hear you're feeling good! Keep practicing self-care and maintaining your well-being.";
        }
        moodFeedbackP.textContent = feedback + "  This is just a quick check-in, and if your feelings persist or worsen, please seek professional help.";
    }
}