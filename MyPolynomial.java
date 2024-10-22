public class MyPolynomial {

        private double[] coeffs;
        public MyPolynomial(double... coeffs) {
            this.coeffs = coeffs;
        }

        public int getDegree() {
            return coeffs.length - 1;
        }

        public String toString() {
            StringBuilder result = new StringBuilder();
            for (int i = coeffs.length - 1; i >= 0; i--) {
                if (coeffs[i] != 0) {
                    result.append(coeffs[i]);
                    if (i > 1) {
                        result.append("x^" + i);
                    } else if (i == 1) {
                        result.append("x");
                    }
                    if (i > 0 && coeffs[i - 1] > 0) {
                        result.append(" + ");
                    } else if (i > 0) {
                        result.append(" - ");
                    }
                }
            }
            return result.toString();
        }
        public double evaluate(double x) {
            double result = 0;
            for (int i = coeffs.length - 1; i >= 0; i--) {
                result = result * x + coeffs[i];
            }
            return result;
        }

        public MyPolynomial add(MyPolynomial right) {
            int maxDegree = Math.max(this.getDegree(), right.getDegree());
            double[] resultCoeffs = new double[maxDegree + 1];

            for (int i = 0; i <= this.getDegree(); i++) {
                resultCoeffs[i] += this.coeffs[i];
            }

            for (int i = 0; i <= right.getDegree(); i++) {
                resultCoeffs[i] += right.coeffs[i];
            }

            return new MyPolynomial(resultCoeffs);
        }

        public MyPolynomial multiply(MyPolynomial right) {
            int resultDegree = this.getDegree() + right.getDegree();
            double[] resultCoeffs = new double[resultDegree + 1];

            for (int i = 0; i <= this.getDegree(); i++) {
                for (int j = 0; j <= right.getDegree(); j++) {
                    resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
                }
            }

            return new MyPolynomial(resultCoeffs);

        }
    }

