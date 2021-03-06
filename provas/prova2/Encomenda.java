package prova2;

public abstract class Encomenda {
	protected int id;

	public Encomenda(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Encomenda other = (Encomenda) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public abstract String toString();

	public abstract int retornaCusto();

}
