


/**
 * @author Renz Rivero (SID: 200377174)
 * 
 * The Postal code is given in the following format "K1a-bxy" as: 
 * 		"K1" is a fixed prefix, 
 * 		"a" is any letter from 'A' to 'T' to indicate the vertical index of the region, 
 * 		"b" is a digit from '0' to '9' to indicate the horizontal index of the region, 
 * 		"x" is any uppercase letter and 
 * 		"y" is any digit. 
 * 
 * 		Assumes that the spacing character (4th) character can also be a space(' ')
 */
public class PostalCode 
{
	private String postalCode;
	private String regexPostal = "^[Kk][1][A-Ta-t][-| ][0-9][A-Za-z][0-9]$";
    	public boolean isValidPostalCode(String postalCode)
    	{
			

			if (!postalCode.matches(this.regexPostal)){
				return false;
			}
			//ToDo: add you code here
			// int length = postalCode.length();
			// String prefix = postalCode.substring(0, 2);	// expects to be "K1"

			// // Capitalize the given vertical index
			// char verticalIndex = Character.toUpperCase(postalCode.charAt(2));
		
			// String temp = postalCode.substring(0, 2) + verticalIndex + postalCode.substring(3);
			// postalCode = temp;

			// // Spacing character
			// char spacing = postalCode.charAt(3);

			// char horizontalIndex = postalCode.charAt(4);

			// if (length != 7)
			// {
			// 	return false;
			// }
			// else if (prefix.equals("K1") == false)
			// {
			// 	return false;
			// }
			// else if (verticalIndex == 'U' | verticalIndex == 'V' | verticalIndex == 'W' | verticalIndex == 'X' | 
			// verticalIndex == 'Y' | verticalIndex == 'Z')
			// {
			// 	return false;
			// }
			// else if (!(spacing == '-' | spacing == ' '))
			// {
			// 	return false;
			// }
			// else if (!(horizontalIndex == '0' | horizontalIndex == '1' | horizontalIndex == '2' | horizontalIndex == '3' | horizontalIndex == '4'
			// | horizontalIndex == '5' | horizontalIndex == '6' | horizontalIndex == '7' | horizontalIndex == '8' | horizontalIndex == '9'))
			// {
			// 	return false;
			// }
			// else if (Character.isDigit(postalCode.charAt(5)))
			// {
			// 	return false;
			// }
			// else if (!Character.isDigit(postalCode.charAt(6)))
			// {
			// 	return false;
			// }
			
			return true;
		}

		PostalCode()
		{
			this.postalCode = "";
		}
		
    	public PostalCode(String postalCode) throws InvalidPostalCodeException
    	{
			//ToDo: add you code here
			if (postalCode == null)
			{
				throw new InvalidPostalCodeException();
			}
			else if (!isValidPostalCode(postalCode))
			{
				throw new InvalidPostalCodeException();
			}

			this.postalCode = postalCode;
		}
		
    	public int getRegionVerticalIndex()
    	{
			//ToDo: add your code here (you can update the return statement) - *** changed the return value from int to char ***
			//Character vIndex = Character.getNumericValue(codePoint)

			//int a = Integer.parseInt(String.valueOf(postalCode.charAt(2)));
    		return Character.getNumericValue(postalCode.charAt(2))-10;
    	}
    	public int getRegionHorizontalIndex()
    	{
			//ToDo: add your code here (you can update the return statement) - *** changed the return value from int to char ***
			//int horizontalIndex = Character.getNumericValue(postalCode.charAt(4));
			int a = Integer.parseInt(String.valueOf(postalCode.charAt(4)));
    		return a;
    	}
    	public String getPostalCode()
    	{
    		//ToDo: add your code here (you can update the return statement) 
    		return this.postalCode;
    	}
}

