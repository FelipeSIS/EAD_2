public class InterleavedArraysTest {
    @DisplayName("Teste de Strings Intercaladas")
    @Test
    void enterTestArrays(){

        int[] A = {1, 2, 3, 4};
        int[] B={7, 8, 9, 10};
        int[] C={1, 7, 2, 8, 3, 9, 4, 10};

        final InterleaveArray sut = new InterleaveArray();
        final String results = sut.compute(A, B);
        assertThat(results.equals(C.toString()));
    }
}
