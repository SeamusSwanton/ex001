package ex003;

//You are going to add a true/false type question to the question heirachy. Call it
//TrueFalseQuestion
//
//When the quiz is displayed, we want this text to preceed the question.
//  Answer True or False: question here
//We want the "Answer True or False: " to be prepended automatically.
//So if the user sets the text of the question to "Albert Einstein was the inventer of Java."
//the question will be displayed to the user like this
//   Answer True or False: Albert Einstein was the inventer of Java.
//
//Capitalization should not matter when determining if the answer is correct. Also t for true
//and f for false should be accepted.
//
//You will need to override three methods although not everyone will override the
//exact same three methods
//
//You will not need to add instance variables
//
//As a starting point, make the changes necessary to prepend the question submitted by the user with
// Answer True or False:

public class TrueFalseQuestion
{
    private String text;
    private String answer;

    /**
       Constructs a question with empty question and answer.
    */
    public TrueFalseQuestion()
    {
        text = "";
        answer = "";
    }

    /**
       Sets the question text.
       @param questionText the text of this question
    */
    public void setText(String questionText)
    {
        text = questionText;
    }

    /**
       Sets the answer for this question.
       @param correctResponse the answer
    */
    public void setAnswer(String correctResponse)
    {
    	
    	correctResponse = correctResponse.toLowerCase();
        answer = correctResponse;
    }

    /**
       Checks a given response for correctness.
       @param response the response to check
       @return true if the response was correct, false otherwise
    */
    public boolean checkAnswer(String response)
    {
    	if(response.equals("t") || response.equals("T")
        ||response.equals("f") ||response.equals("F")){
    		if(response.equals("t") || response.equals("T")) {
    			response = "true";
    		}
    		else {
    			response = "false";
    		}
        	}
    	response = response.toLowerCase();
        return response.equals(answer);
    }

    /**
       Displays this question.
    */
    public void display()
    {
        System.out.println("Answer True or False: " + text);
    }
}

