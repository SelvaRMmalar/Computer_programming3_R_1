public class CscExample
{
	private int quesionNo;
        private String category;
	private String text;
	public void setQuestionNo(int quesion)
	{
		this.quesion=quesion;
	}
	public void setcategory(String category)
	{
		this.category=category;
	}
	public void setText(String text)
	{
		this.text=text;
	}

	public int getQuesionNo()
	{
		return quesionNo;
	}
	public String getCategory()
	{
		return category;
	}
	public String getText()
	{
		return text;
	}
	public void addQuesion(CscExample qu)
	{
		setQuestionNo(qu.getQuesionNo());
		setText(qu.setText());
		setcategory(qu.setcategory);

	}
	public void removeQuestion(int qnId)
	{

	

		

	}
	public void editQuestion(int qnId)
	{

		setQuestionNo(qnId);


	}

}

