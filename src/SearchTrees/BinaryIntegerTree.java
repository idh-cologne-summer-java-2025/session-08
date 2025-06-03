package SearchTrees;

/**
 * Klasse zum Speichern von int-Werten in einem sortierten Binärbaum
 */
public class BinaryIntegerTree {

	/**
	 * Innere Klasse, die einen int-Binärbaumknoten repräsentiert
	 */
	class BinaryIntegerTreeNode {

		public BinaryIntegerTreeNode(int value) {
			this.value = value;
		}

		BinaryIntegerTreeNode left;
		BinaryIntegerTreeNode right;
		int value;

		/**
		 * Rekursive Methode für das Hinzufügen von int-Werten
		 * 
		 * @param value int-Wert
		 * @return true, wenn Wert hinzugefügt wurde, false, wenn er schon vorhandem war
		 */
		public boolean addValue(int value) {
			// TODO: Implement!
			return true;
		}

		public void printInOrder() {
			// TODO: Implement!
		}

		public boolean contains(int searchValue) {
            if (searchValue == value) {
                return true;
            } else if (searchValue < value) {
                return (left != null) && left.contains(searchValue);
            } else {
                return (right != null) && right.contains(searchValue);
            }
        }
	}

	/**
	 * Die Wurzel des Baums
	 */
	private BinaryIntegerTreeNode root;

	/**
	 * Methode für das Hinzufügen von int-Werten in den Baum
	 * 
	 * @param value int-Wert
	 * @return true, wenn Wert hinzugefügt wurde, false, wenn er schon vorhandem war
	 */
	public boolean addValue(int value) {
		// TODO: Implement!
		return true;
	}

	/**
	 * Soll den Baum in der sortierten Reihenfolge ausgeben
	 */
	public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        } else {
            System.out.println("Der Baum ist leer.");
        }
    }

	/**
	 * Überprüft, ob der spezifizierte Wert enthalten ist.
	 */
	public boolean contains(int value) {
        return root != null && root.contains(value);
    }

}
