public class Main {
    public static void main(String[] args) {
        Handler compensationClaimHandler = new CompensationClaimHandler();
        Handler contactRequestHandler = new ContactRequestHandler();
        Handler developmentSuggestionHandler = new DevelopmentSuggestionsHandler();
        Handler generalFeedbackHandler = new GeneralFeedbackHandler();

        compensationClaimHandler.setNextHandler(developmentSuggestionHandler);
        developmentSuggestionHandler.setNextHandler(generalFeedbackHandler);
        generalFeedbackHandler.setNextHandler(contactRequestHandler);

        Message contactRequest = new Message(MessageType.CONTACT_REQUEST, "App random shows pictures of banana. I want to contact the CEO.", "test@test.com");
        Message compensationClaim = new Message(MessageType.COMPENSATION_CLAIM, "I hate banana, app shows too much banana", "test1@test.com");
        Message generalFeedback = new Message(MessageType.GENERAL_FEEDBACK, "Change banana to apple", "test2@test.com");
        Message developmentSuggestion = new Message(MessageType.DEVELOPMENT_SUGGESTIONS, "Change the app's colour from yellow to red", "test3@test.com");

        compensationClaimHandler.handle(contactRequest);
        compensationClaimHandler.handle(compensationClaim);
        compensationClaimHandler.handle(generalFeedback);
        compensationClaimHandler.handle(developmentSuggestion);
    }
}
