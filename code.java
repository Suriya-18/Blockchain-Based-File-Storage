import io.ipfs.api.IPFS;
import io.ipfs.api.MerkleNode;
import io.ipfs.api.NamedStreamable;

import java.io.File;

public class BlockchainFileStorage {
    public static void main(String[] args) throws Exception {
        IPFS ipfs = new IPFS("/ip4/127.0.0.1/tcp/5001");
        File file = new File("testfile.txt");
        NamedStreamable.FileWrapper fileWrapper = new NamedStreamable.FileWrapper(file);
        MerkleNode addResult = ipfs.add(fileWrapper).get(0);
        System.out.println("File uploaded to IPFS: " + addResult.hash);
    }
}
